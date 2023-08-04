package org.In_Walmart.Raj_Vik.Recursion;

public class Print_WIth_BackTrack {

    public static void main(String[] args) {
        backTrack(5,5);
        System.out.println("=============");
        backTrack2(1,5);
    }

    private static void backTrack(int i, int n) {
        if(i<1) return;
        backTrack(i-1, n);
        System.out.println(i);
    }

    private static void backTrack2(int i, int n) {
        if(i>n) return;
        backTrack2(i+1, n);
        System.out.println(i);
    }
}
