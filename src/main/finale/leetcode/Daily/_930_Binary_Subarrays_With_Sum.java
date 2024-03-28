package main.finale.leetcode.Daily;

public class _930_Binary_Subarrays_With_Sum {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int res = numSubarraysWithSum(arr, 2);
        System.out.println(res);
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int psum = 0, res = 0, freq[] = new int[nums.length + 1];
        freq[0] = 1;
        for (int i : nums) {
            psum += i;
            if (psum >= goal)
                res += freq[psum - goal];
            freq[psum]++;
        }
        return res;
    }
}
