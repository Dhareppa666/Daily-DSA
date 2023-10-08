package main.finale.In_Walmart.LC.Daily;

import java.util.Arrays;

//Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
//Return the maximum product you can get.
public class _343_Integer_Break {

    public static void main(String[] args) {
        int res = integerBreak(10);
        System.out.println(res);
    }

    public static int integerBreak(int n) {
        int[] dp = new int[59];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public static int solve(int n, int[] dp) {
        if(n==1) {
            return 1;
        }
        if(dp[n]!=-1) {
            return dp[n];
        }
        int result = Integer.MIN_VALUE;
        for(int i =1; i<n; i++) {
            int max = i * Math.max(n-i, solve(n-i, dp));
            result = Math.max(max, result);
        }
        return dp[n] =result;
    }
}
