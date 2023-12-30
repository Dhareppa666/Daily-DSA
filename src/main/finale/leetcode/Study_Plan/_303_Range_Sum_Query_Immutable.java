package main.finale.leetcode.Study_Plan;

//https://leetcode.com/problems/range-sum-query-immutable/
public class _303_Range_Sum_Query_Immutable {

    int[] freq = null;

    public _303_Range_Sum_Query_Immutable(int[] nums) {
        freq = new int[nums.length+1];

        for(int i=0; i<nums.length; i++) {
            freq[i+1] = nums[i] + freq[i];
        }
    }

    public int sumRange(int left, int right) {
        return freq[right+1] - freq[left];
    }
}
