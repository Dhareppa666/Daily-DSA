package main.finale.test;

public class staticVarTesting {

    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        staticVarTesting s = null;
        System.out.println(s.a); //NPE :(
        System.out.println(s.b);
    }
}
