package main.finale.DSA.dp;

import java.util.Arrays;

public class _198_House_Robber {

    public static void main(String[] args) {
        int[] houses = {1, 2, 1, 1};
        int res = rob2(houses);
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

    public static int rob2(int[] nums) {
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}
