package main.finale.leetcode.Daily;

import java.util.*;

//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/?envType=daily-question&envId=2024-01-02
public class _2610_Convert_an_Array_Into_a_2D_Array_With_Conditions {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> res = findMatrix(nums);
        System.out.println(res);
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[nums.length + 1];
        List<List<Integer>> ans = new ArrayList<>();

        for (int c : nums) {
            if (freq[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }

            ans.get(freq[c]).add(c);
            freq[c]++;
        }

        return ans;
    }

    public static List<List<Integer>> findMatrix2(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            max = Math.max(max, map.get(nums[i]));
        }
        for (int i = 0; i < max; i++) {
            result.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            for (int i = 1; i <= m.getValue(); i++) {
                result.get(i - 1).add(m.getKey());
            }
        }
        return result;
    }
}
