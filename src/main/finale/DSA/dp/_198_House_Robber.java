package main.finale.DSA.dp;

import java.util.Arrays;

public class _198_House_Robber {

    public static void main(String[] args) {
        int[] houses = {1, 2, 1, 1};
        int res = rob(houses);
        System.out.println(res);
    }

    public static int rob(int[] nums) {
        // Your code goes here
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return rec(nums, 0, 0, dp);
    }

    public static int rec(int[] nums, int index, int sum, int[] dp) {
        if (index >= nums.length) {
            return sum;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int rob = rec(nums, index + 2, sum + nums[index], dp);
        int skip = rec(nums, index + 1, sum, dp);
        return dp[index] = Math.max(rob, skip);
    }
}
