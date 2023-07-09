package org.In_Walmart.nextLeap.Problems;

import java.util.Arrays;

public class find_missing_number {

    public static void main(String[] args) {
        int res = missingNumber2(new int[]{3,0,1});
        System.out.println(res);
    }

    private static int findNum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int low = 0, high = length-1, ans = length, mid;
        while(low <= high){
            mid = low + (high-low)/2;
            if(nums[mid] > mid){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    private static  int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }

    private static  int missingNumber2(int[] nums) {
        int totalSum = nums.length * ((nums.length-1)/2);//3* 2 /2 = 3-
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return totalSum - sum;
    }
}
