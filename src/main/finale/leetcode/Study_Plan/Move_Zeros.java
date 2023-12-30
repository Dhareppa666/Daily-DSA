package main.finale.leetcode.Study_Plan;

public class Move_Zeros {

    public static void main(String[] args) {

    }

    public void moveZeroes2(int[] nums) {
        int counter = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[counter++] = nums[i];
            }
        }
        while(counter!=nums.length){
            nums[counter++] = 0;
        }
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
