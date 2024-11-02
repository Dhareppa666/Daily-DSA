package main.finale.test.interfaceTest;

public interface Parent {

    int x = 10;
    static int y = 20;

    void m1();

    static void m2() {
        System.out.println("m2 executed from parent");
    }

    default void m3() {
        System.out.println("m3 executed from parent");
    }
}
