package org.Tech.Dose.Arrays;

public class RecursionExample {

    public static void main(String[] args) {
        System.out.println(-3%-2);
        f(6);
    }

    public static final void f(int i) {
        if (i > 2) {
            //f(i-1);
            f(--i);
            //f(i--);
        }
        System.out.print(i);
    }
}
