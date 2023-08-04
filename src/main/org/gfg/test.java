package org.gfg;

public class test {

    public static void main(String[] args) {
        get(6);
    }

    public static void get (int n)
    {
        if (n < 1) return;
        get(n-1);
        get(n-3);
        System.out.println(n);
    }
}
