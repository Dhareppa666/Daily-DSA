package main.finale.Java.QuadTrees;

public class Driver implements QuadTree.Locatable {
    private final double x, y;
    private final String id;

    public Driver(double x, double y, String id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public String getId() { return id; }
}
