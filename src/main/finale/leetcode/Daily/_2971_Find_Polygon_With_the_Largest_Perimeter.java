package main.finale.leetcode.Daily;

import java.util.Arrays;

public class _2971_Find_Polygon_With_the_Largest_Perimeter {

    public static void main(String[] args) {
        int[] arr = {1,12,1,2,5,50,3};
        long res = largestPerimeter(arr);
        System.out.println(res);
    }

    public static long largestPerimeter2(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        long ans = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < sum) {
                ans = nums[i] + sum;
            }
            sum += nums[i];
        }

        return ans;
    }

    public static long largestPerimeter(int[] nums) {
        long res = -1;
        if (nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(prefixSum));
        int left = 0, right = 0, len = nums.length;
        while (right < len) {
            if (right - left + 1 < 3) {
                right++;
                continue;
            }
            int sum  = prefixSum[right] - (left-1 < 0 ? 0 : prefixSum[left]) - nums[right];
            if(nums[right] < sum) {
                res = Math.max(res, (long) (prefixSum[right] - (left-1 < 0 ? 0 : prefixSum[left])));
            }
            right++;
        }

        return res;
    }
}
