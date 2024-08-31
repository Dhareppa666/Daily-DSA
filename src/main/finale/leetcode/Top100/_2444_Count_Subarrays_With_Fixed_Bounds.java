package main.finale.leetcode.Top100;

public class _2444_Count_Subarrays_With_Fixed_Bounds {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 7, 5};
        long res = countSubarrays(nums, 1, 5);
        System.out.println(res);
    }

    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0L;
        int minKIndex = -1, maxKIndex = -1, ci = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                ci = i;
            }
            if (nums[i] == minK) {
                minKIndex = i;
            }
            if (nums[i] == maxK) {
                maxKIndex = i;
            }
            int minval = Math.min(minKIndex, maxKIndex);
            int temp = minval - ci;
            ans += temp > 0L ? temp : 0L;
        }
        return ans;
    }
}
