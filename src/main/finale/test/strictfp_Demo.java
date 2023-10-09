package main.finale.test;

public class strictfp_Demo {
    public strictfp static void main(String[] args) {
        m1(123.25F);
        m2(123.25001F);
    }

    private static void m1(Float v) {
        System.out.println(v);
    }

    private strictfp static void m2(Float v) {
        System.out.println(v);
    }
}
