package main.finale.leetcode.Daily;

import java.util.*;

public class _2870_Minimum_Number_of_Operations_to_Make_Array_Empty {

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        int res = minOperations(nums);
        System.out.println(res);
    }

    public static int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int res = 0;
        for(Map.Entry<Integer, Integer> m: map.entrySet()) {
            if(m.getValue() ==1) {
                return -1;
            } else if(m.getValue()%3 == 0) {
                res += m.getValue() / 3;
            } else {
                res += (m.getValue() / 3) + 1;
            }
        }
        return res;
    }
}
