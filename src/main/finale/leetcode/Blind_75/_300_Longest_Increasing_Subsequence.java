package main.finale.leetcode.Blind_75;

import java.util.Arrays;

//https://leetcode.com/problems/longest-increasing-subsequence/?envType=list&envId=myi2rqdi
public class _300_Longest_Increasing_Subsequence {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int count = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                    count = Math.max(count, dp[i]);
                }
            }
        }
        return count;
    }
}
