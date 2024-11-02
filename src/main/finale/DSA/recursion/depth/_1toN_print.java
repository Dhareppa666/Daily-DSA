package main.finale.DSA.recursion.depth;

public class _1toN_print {

    public static void main(String[] args) {
        rec(10);
    }

    public static void rec(int n) {
        if(n<1) {
            return;
        }
        rec(n-1);
        System.out.println(n);
    }
}
