package main.finale.In_Walmart.array;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        Test2 test = new Test2();
        System.out.println(Arrays.toString(test.numberOfPairs(new int[]{1,3,2,1,3,2,2})));
    }

    public int[] numberOfPairs(int[] nums) {
        int[] res = new int[2];
        int count = 0;
        int index = 0;
        for(int i=index+1; i<nums.length; i++){
            if(nums[index]==nums[i]){
                count++;
                nums = removedFromArray(nums, index, i);
                i=0;
                index=0;
            }
        }
        res[0] = count;
        res[1] = nums.length;
        return res;
    }

    public int[] removedFromArray(int[] nums, int i, int j){
        int[] res = new int[nums.length-2];
        int index = 0;
        for(int x=0; x<nums.length; x++){
            if(x==i||x==j){

            }else{
                res[index++]=nums[x];
            }
        }
        return res;
    }
}
