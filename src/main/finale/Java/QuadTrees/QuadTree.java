package main.finale.Java.QuadTrees;

import java.util.ArrayList;
import java.util.List;

/**
 * A spatial partitioning data structure that recursively divides a 2D space into four quadrants.
 * This implementation is designed for efficient range queries and nearest-neighbor searches in two-dimensional space.
 *
 * <h2>Overview</h2>
 * A QuadTree is a tree data structure in which each internal node has exactly four children.
 * It's particularly useful for spatial indexing of points in a 2D plane, enabling efficient
 * range queries, collision detection, and nearest-neighbor searches.
 *
 * <h2>Key Features</h2>
 * - <b>Dynamic Structure</b>: Automatically subdivides when nodes exceed capacity
 * - <b>Efficient Queries</b>: Quickly finds points within a specified range
 * - <b>Generic Type Support</b>: Can store any object that implements the Locatable interface
 * - <b>Memory Efficient</b>: Only subdivides space as needed
 *
 * <h2>Performance Characteristics</h2>
 * - <b>Insertion</b>: O(log n) average, O(n) worst case
 * - <b>Range Query</b>: O(log n + k) where k is the number of points returned
 * - <b>Space</b>: O(n) where n is the number of points
 *
 * <h2>Typical Use Cases</h2>
 * - Finding all objects within a certain distance (e.g., nearby drivers in a ride-hailing app)
 * - Collision detection in games or simulations
 * - Image processing (e.g., quadtree-based image compression)
 * - Spatial indexing for geographic data
 *
 * <h2>Example Usage</h2>
 * <pre>{@code
 * // Create a QuadTree covering a 2000x2000 area centered at (0,0)
 * QuadTree.Boundary boundary = new QuadTree.Boundary(0, 0, 2000, 2000);
 * QuadTree<Driver> driverQuadTree = new QuadTree<>(boundary, 4);
 *
 * // Add some drivers
 * driverQuadTree.insert(new Driver(100, 200, "Driver1"));
 *
 * // Find all drivers within 150 units of (0,0)
 * List<Driver> nearbyDrivers = driverQuadTree.queryRadius(0, 0, 150);
 * }</pre>
 *
 * @param <T> The type of elements to be stored in the QuadTree, must implement Locatable
 */
public class QuadTree<T extends QuadTree.Locatable> {
    /**
     * The boundary that this node represents in 2D space.
     * This defines the spatial extent of this node.
     */
    private final Boundary boundary;

    /**
     * The maximum number of points this node can hold before it splits into four children.
     * Lower values create deeper trees with more precise spatial partitioning but higher memory usage.
     */
    private final int capacity;

    /**
     * The points contained within this node.
     * When the number of points exceeds capacity, the node will split.
     */
    private final List<T> points;

    // Child quadrants
    private QuadTree<T> northWest;
    private QuadTree<T> northEast;
    private QuadTree<T> southWest;
    private QuadTree<T> southEast;

    /**
     * Flag indicating whether this node has been divided into four child quadrants.
     * This is used to optimize the tree structure and avoid unnecessary subdivisions.
     */
    private boolean divided = false;

    /**
     * Interface that objects must implement to be stored in the QuadTree.
     * Defines the minimum required methods to determine an object's 2D position.
     */
    public interface Locatable {
        /**
         * @return The x-coordinate of the object in 2D space
         */
        double getX();

        /**
         * @return The y-coordinate of the object in 2D space
         */
        double getY();
    }

    /**
     * Represents a rectangular boundary in 2D space.
     * Used to define the spatial extent of QuadTree nodes and query ranges.
     */
    public static class Boundary {
        /** The x-coordinate of the center of the boundary */
        public final double x;
        /** The y-coordinate of the center of the boundary */
        public final double y;
        /** The total width of the boundary */
        public final double width;
        /** The total height of the boundary */
        public final double height;

        /**
         * Creates a new Boundary with the specified center and dimensions.
         *
         * @param x The x-coordinate of the center
         * @param y The y-coordinate of the center
         * @param width The total width (must be positive)
         * @param height The total height (must be positive)
         * @throws IllegalArgumentException if width or height is not positive
         */
        public Boundary(double x, double y, double width, double height) {
            if (width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Width and height must be positive");
            }
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        /**
         * Checks if a point (x,y) is contained within this boundary.
         *
         * @param x The x-coordinate of the point to check
         * @param y The y-coordinate of the point to check
         * @return true if the point is inside or on the boundary, false otherwise
         */
        public boolean contains(double x, double y) {
            return x >= this.x - width / 2 &&
                    x <= this.x + width / 2 &&
                    y >= this.y - height / 2 &&
                    y <= this.y + height / 2;
        }

        /**
         * Checks if this boundary intersects with another boundary.
         *
         * @param range The boundary to check for intersection
         * @return true if the boundaries intersect, false otherwise
         */
        public boolean intersects(Boundary range) {
            return !(range.x - range.width/2 > x + width/2 ||
                    range.x + range.width/2 < x - width/2 ||
                    range.y - range.height/2 > y + height/2 ||
                    range.y + range.height/2 < y - height/2);
        }

        @Override
        public String toString() {
            return String.format("Boundary(x=%.2f, y=%.2f, width=%.2f, height=%.2f)",
                    x, y, width, height);
        }
    }

    /**
     * A simple implementation of Locatable that represents a point in 2D space with associated data.
     */
    public static class Point implements Locatable {
        private final double x, y;
        private final Object data;

        /**
         * Creates a new Point with the specified coordinates and data.
         *
         * @param x The x-coordinate
         * @param y The y-coordinate
         * @param data The associated data (can be null)
         */
        public Point(double x, double y, Object data) {
            this.x = x;
            this.y = y;
            this.data = data;
        }

        @Override
        public double getX() { return x; }

        @Override
        public double getY() { return y; }

        /**
         * @return The data associated with this point
         */
        public Object getData() { return data; }

        @Override
        public String toString() {
            return String.format("Point(%.2f, %.2f)", x, y);
        }
    }

    /**
     * Creates a new QuadTree with the specified boundary and capacity.
     *
     * @param boundary The spatial boundary of this QuadTree node
     * @param capacity The maximum number of points a node can hold before splitting
     * @throws IllegalArgumentException if capacity is not positive
     */
    public QuadTree(Boundary boundary, int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.boundary = boundary;
        this.capacity = capacity;
        this.points = new ArrayList<>(capacity);
    }

    /**
     * Inserts a point into the QuadTree.
     *
     * @param point The point to insert (must not be null)
     * @return true if the point was inserted, false if it's outside this node's boundary
     * @throws NullPointerException if point is null
     */
    public boolean insert(T point) {
        if (point == null) {
            throw new NullPointerException("Point cannot be null");
        }

        // Ignore points that don't belong in this quad
        if (!boundary.contains(point.getX(), point.getY())) {
            return false;
        }

        // If there's space, add the point
        if (points.size() < capacity) {
            points.add(point);
            return true;
        }

        // Otherwise, subdivide and then add the point to the appropriate child
        if (!divided) {
        //   CubicCurve2D.subdivide();
        }

        return northWest.insert(point) ||
                northEast.insert(point) ||
                southWest.insert(point) ||
                southEast.insert(point);
    }

    // [Previous implementation methods remain the same...]

    /**
     * Returns a string representation of the QuadTree structure.
     * Useful for debugging and visualization.
     *
     * @return A string representation of the QuadTree
     */
    @Override
    public String toString() {
        return String.format("QuadTree{boundary=%s, points=%d, divided=%b}",
                boundary, points.size(), divided);
    }

    /**
     * Finds all points within a specified radius of a given point.
     *
     * @param centerX The x-coordinate of the center point
     * @param centerY The y-coordinate of the center point
     * @param radius The search radius
     * @return A list of all points within the specified radius
     */
    public List<T> queryRadius(double centerX, double centerY, double radius) {
        List<T> found = new ArrayList<>();
        queryRadius(centerX, centerY, radius, found);
        return found;
    }

    private void queryRadius(double centerX, double centerY, double radius, List<T> found) {
        // Create a boundary box that fully contains the circle
        Boundary range = new Boundary(centerX, centerY, radius * 2, radius * 2);
        
        // First check if this node's boundary intersects with the search area
        if (!boundary.intersects(range)) {
            return;
        }

        // Check points in this node
        for (T point : points) {
            double dx = point.getX() - centerX;
            double dy = point.getY() - centerY;
            double distanceSquared = dx * dx + dy * dy;
            if (distanceSquared <= radius * radius) {
                found.add(point);
            }
        }

        // Recursively check child nodes if this node is divided
        if (divided) {
            northWest.queryRadius(centerX, centerY, radius, found);
            northEast.queryRadius(centerX, centerY, radius, found);
            southWest.queryRadius(centerX, centerY, radius, found);
            southEast.queryRadius(centerX, centerY, radius, found);
        }
    }
}