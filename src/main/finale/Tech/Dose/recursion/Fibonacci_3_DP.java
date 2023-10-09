package org.Tech.Dose.recursion;

import java.util.Arrays;

public class Fibonacci_3_DP {

//    private static int[] dp =

    public static void main(String[] args) {//0,1,1,2,3,5,8,13,21
        int n = 8;
        int[] dp = new int[n + 2];
        Arrays.fill(dp, -1);
        int result = fibonacci_DP(n);
        System.out.println(result);
    }

    private static int fibonacci_DP(int n) {
        if (n == 0 || n == 1)
            return n;
        return 1;
    }
}
