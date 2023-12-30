package main.finale.Java.streams;

@FunctionalInterface
public interface Test<A, B, C> {

    public C apply(A a, B b);

    default void printString() {
        System.out.println("softwaretestinghelp");
    }

    static void m2() {
    }

}