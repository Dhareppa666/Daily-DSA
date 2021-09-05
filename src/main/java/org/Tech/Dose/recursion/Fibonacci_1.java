package org.Tech.Dose.recursion;

public class Fibonacci_1 {

    public static void main(String[] args) {//0,1,1,2,3,5,8,13,21
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
    }

    private static int fib(int i) {
        if (i == 1 || i == 0) {
            return i;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }
}
