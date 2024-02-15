package main.finale.DSA.arrays;

import java.util.Arrays;

//To find the pivot index in an array, you need to locate the index where the sum of the
// elements to the left of the index is equal to the sum of the elements to the right of the index.
public class Find_Pivot_Index {

    public static void main(String[] args) {
        int index = pivotIndex(new int[]{1,7,3,6,5,6});
        System.out.println(index);
    }

    public static int pivotIndex(int[] nums) {
        // Your code goes here
        int sum = Arrays.stream(nums).sum(), leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            if(leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

}
