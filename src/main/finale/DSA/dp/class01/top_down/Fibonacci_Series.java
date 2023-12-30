package main.finale.DSA.dp.class01.top_down;

import java.util.Arrays;

public class Fibonacci_Series {

    public static void main(String[] args) {
        int fib = 6;
        int[] dp = new int[fib + 1];
        Arrays.fill(dp, -1);
        int fibValue = fib(fib, dp);
        System.out.println(fibValue);
    }

    private static int fib(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}
