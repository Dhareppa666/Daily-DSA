package main.finale.leetcode.Weekly.mera;

import java.util.*;

public class _17th_Feb_24 {

    public static int maxOperations(int[] nums) {
        int max = 0, n = nums.length;
        for (int score : new HashSet<>(List.of(nums[0] + nums[1], nums[0] + nums[nums.length - 1], nums[nums.length - 1] + nums[nums.length - 2]))) {
            max = Math.max(max, dfs(nums, 0, n - 1, score, new HashMap<String, Integer>()));
        }
        return max;
    }

    private static int dfs(int[] nums, int low, int high, int score, Map<String, Integer> cache) {
        if (high <= low) {
            return 0;
        }
        String key = low + ", " + high;
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            int max = 0;
            if (score == nums[low] + nums[low + 1]) {
                max = Math.max(max, 1 + dfs(nums, low + 2, high, score, cache));
            }
            if (score == nums[low] + nums[high]) {
                max = Math.max(max, 1 + dfs(nums, low + 1, high - 1, score, cache));
            }
            if (score == nums[high] + nums[high - 1]) {
                max = Math.max(max, 1 + dfs(nums, low, high - 2, score, cache));
            }
            cache.put(key, max);
            return max;
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 3, 4};
        System.out.println(maxOperations(arr));
    }

    public static int maxOperations2(int[] nums) {
        return Math.max(
                Math.max(helper(nums, 0, 1, 0, nums[0] + nums[1]),
                        helper(nums, 0, nums.length - 1, 0, nums[0] + nums[nums.length - 1])
                ),
                helper(nums, nums.length - 2, nums.length - 1, 0, nums[nums.length - 2] + nums[nums.length - 1]));

    }

    public static int helper(int[] nums, int left, int right, int res, int sum) {
        if (left < 0 || left >= nums.length || right < 0 || right >= nums.length) {
            return res;
        }
        if (sum == nums[left] + nums[right]) {
            res++;
        }
        sum = nums[left] + nums[right];
        int firstTwo = Math.max(res, helper(nums, left + 2, right + 2, res, sum));
        int lastTwo = Math.max(res, helper(nums, right - 2, right - 1, res, sum));
        int firstAndLast = Math.max(res, helper(nums, left + 1, right - 1, res, sum));
        return Math.max(Math.max(firstTwo, lastTwo), firstAndLast);
    }
}
