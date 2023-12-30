package main.finale.DSA.arrays;

import java.util.Arrays;

public class Squares_Sorted_Array {

    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    //Input: nums = [-4,-1,0,3,10]
    //Output: [0,1,9,16,100]

    //Using 2 Pointers
    public int[] sortedSquares2(int[] nums) {
        int[] res = new int[nums.length];
        int low=0, high = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(Math.abs(nums[low]) > Math.abs(nums[high])){
                res[i] = nums[low] * nums[low];
                low++;
            } else {
                res[i] = nums[high] * nums[high];
                high--;
            }
        }
        return res;
    }
}
