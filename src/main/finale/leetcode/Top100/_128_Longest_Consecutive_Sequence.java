package main.finale.leetcode.Top100;

import java.util.*;

public class _128_Longest_Consecutive_Sequence {

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int res = longestConsecutive(nums);
        System.out.println(res);
    }

    public static int longestConsecutive(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;

                int sum = left + right + 1;

                res = Math.max(sum, res);

                map.put(n, sum);
                map.put(n - left, sum);
                map.put(n + right, sum);
            }
        }
        return res;
    }
}
