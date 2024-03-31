package main.finale.leetcode.Top100;

public class _2962_Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times {

    //You are given an integer array nums and a positive integer k.
    //Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.
    //A subarray is a contiguous sequence of elements within an array.
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 3, 1, 2};
        long res = countSubarrays(arr, 2);
        System.out.println(res);
    }

    public static long countSubarrays(int[] nums, int k) {
        long ans = 0L;
        int max = nums[0];
        for (int x : nums) {
            max = Math.max(max, x);
        }
        int i = 0, j = 0;
        int freq = 0;
        while (j < nums.length) {
            if (nums[j] == max) {
                freq++;
            }
            while (freq >= k && i <= j) {
                ans += (nums.length - j);
                if (nums[i] == max) {
                    freq--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
