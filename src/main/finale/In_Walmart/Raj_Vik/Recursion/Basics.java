package main.finale.In_Walmart.Raj_Vik.Recursion;

public class Basics {

    public static void main(String[] args) {
        int res = callFn(0);
    }

    private static int callFn(int i) {
        i++;
        System.out.println(i);
        return callFn(i);
    }
}
