package main.finale.leetcode.Weekly;

public class Test {

    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.minimumOperations(new int[]{1,5,0,3,5}));
    }

    public int minimumOperations(int[] nums) {
        int res = 0;
        while(!isArrSumZero(nums)){
            int min = finMinInArr(nums);
            for(int i=0; i<nums.length; i++){
                if(nums[i]-min>=0)
                    nums[i] = nums[i]-min;
            }
            res++;
        }
        return res;
    }

    public int finMinInArr(int[] nums){
        int x = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0)
                x = Math.min(x, nums[i]);
        }
        return x;
    }

    public boolean isArrSumZero(int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0) {
                return false;
            }
        }
        return true;
    }
}
