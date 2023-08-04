package org.In_Walmart.LC.Study_Plan;
//283. https://leetcode.com/problems/move-zeroes/
public class Move_Zeroes_at_End {

    public static void main(String[] args) {
        //nums = [0,1,0,3,12]
    }

    public void moveZeroes(int[] nums) {
        if(nums.length<=1)
            return;
        int zeroSize = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zeroSize++;
            } else if (zeroSize >0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i-zeroSize] = temp;
            }
        }
    }
}
