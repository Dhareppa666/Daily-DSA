package main.finale.leetcode.Daily;

import java.util.*;

public class _442_Find_All_Duplicates_in_an_Array {

    public static void main(String[] args) {
        int[] input = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDuplicates(input);
        System.out.println(res);
    }

    // When find a number i, flip the number at position i-1 to negative.
    // if the number at position i-1 is already negative, i is the number that occurs twice.
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            int idx = num - 1;
            if (nums[idx] < 0) {
                list.add(num);
            } else {
                nums[idx] = -1 * nums[idx];
            }
        }
        return list;
    }
}
