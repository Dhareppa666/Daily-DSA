package org.In_Walmart.array;

public class Test3 {

    public static void main(String[] args) {
        Test3 test = new Test3();

        System.out.println(test.maximumSum(new int[]{18,43,36,13,7}));
    }

    public int maximumSum(int[] nums) {
        int[] sumArr = new int[nums.length];
        int left=0, right=0;
        for(int i=0; i<nums.length; i++){
            sumArr[i] = getDigitSum(nums[i]);
            left = (i );
            right = Math.max(right, sumArr[i]);
        }
        return sumArr[left] + sumArr[right];
    }

    public int getDigitSum(int x){
        int res = 0;
        while(x>0){
            int mod = x%10;
            x = x/10;
            res+=mod;
        }
        return res;
    }
}
