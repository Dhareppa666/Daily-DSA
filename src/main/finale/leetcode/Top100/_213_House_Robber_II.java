package main.finale.leetcode.Top100;

public class _213_House_Robber_II {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int res = rob(nums);
        System.out.println(res);
    }

    public static int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int[] first = new int[nums.length - 1];
        int[] last = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            first[i] = nums[i];
            last[i] = nums[i + 1];
        }
        return Math.max(rec(first), rec(last));
    }

    public static int rec(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
