package main.finale.Java.Garbage_Collection;

public class TestGarbage {

    @Override
    public void finalize() {
        System.out.println("object is garbage collected");
    }

    public static void main(String args[]) {
        TestGarbage s1 = new TestGarbage();
        TestGarbage s2 = new TestGarbage();
        System.gc();
        s1 = null;
        s2 = null;
        s2 = new TestGarbage();
        System.gc();
    }
}
