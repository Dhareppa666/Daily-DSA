package main.finale.Java.QuadTrees;

import java.util.List;

public class RideHailingApp {
    public static void main(String[] args) {
        // Create a QuadTree that covers a 1000x1000 area centered at (0,0)
        QuadTree.Boundary boundary = new QuadTree.Boundary(0, 0, 2000, 2000);
        QuadTree<Driver> driverQuadTree = new QuadTree<Driver>(boundary, 4);

        // Add some drivers
        driverQuadTree.insert(new Driver(100, 200, "Driver1"));
        driverQuadTree.insert(new Driver(-50, 75, "Driver2"));
        driverQuadTree.insert(new Driver(200, -150, "Driver3"));
        driverQuadTree.insert(new Driver(-100, -200, "Driver4"));

        // Find all drivers within 150 units of location (0,0)
        List<Driver> nearbyDrivers = driverQuadTree.queryRadius(0, 0, 150);

        System.out.println("Nearby drivers:");
        for (Driver driver : nearbyDrivers) {
            System.out.println(driver.getId() + " at (" + driver.getX() + ", " + driver.getY() + ")");
        }
    }
}
