package main.finale.test.interfaceTest;

public abstract class AbstractClassEx {

    int x;
    int y;
    static int z = 500;

    static {
        z = 1000;
    }

    public AbstractClassEx(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
