package org.In_Walmart.nextLeap.arrays;

public class Move_Zeros {

    public static void main(String[] args) {
        int[] res =moveZeros(new int[]{0,1,0,3,12});
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+",");
        }
    }

    public static int[] moveZeros(int[] nums) {
        // Your code goes here
        int index = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                nums[++index] = nums[i];
            }
        }
        for(int i = index+1; i<nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }
}
