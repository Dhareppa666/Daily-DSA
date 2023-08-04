package org.In_Walmart.nextLeap.Bit_Manipulation;

public class Swap_Two_Numbers {

    public static void main(String[] args) {
        swap(10,25);
    }

    private static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + ", " + b);
    }
}
