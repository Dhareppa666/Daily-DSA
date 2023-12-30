package main.finale.leetcode.Weekly;

import java.util.Arrays;

public class Weekly {

    public static void main(String[] args) {
        int res = maxNumOfMarkedIndices(new int[]{3,5,2,4});
        System.out.println(res);
    }

    public static int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int res=0, mid = nums.length/2;
        for(int index=0; index < nums.length; index++) {
            if((nums[mid] * 2) <= nums[mid+1]){
                res+=2;
                mid++;
            } else {
                continue;
            }
        }
        return res;
    }
}

//[9,2,5,4] --> [2,4,5,9]