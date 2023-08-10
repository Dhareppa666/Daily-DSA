package main.finale.In_Walmart.nextLeap.arrays;

import java.util.Arrays;

public class find_missing_number {

    public static void main(String[] args) {
        int res = missingNumber4(new int[]{3,0,1});
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

    public static int missingNumber3(int[] nums) {
        int n = nums.length;
        for(int i=0; i<nums.length; i++ ) {
            if(nums[i]!=i) {
                if(nums[i] == n) {
                    System.out.println("executed!!");
                    continue;
                }
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        for(int i=0; i<n; i++) {
            if(nums[i]!=i) {
                return i;
            }
        }
        return n;
    }

    public static int missingNumber4(int[] nums) {
        int n = nums.length;
        for(int i=0; i<nums.length; i++ ) {
            if(nums[i]!=i) {
                if(nums[i] == n) {
                    System.out.println("executed!!");
                    continue;
                }
                nums[i] += n ;
            }
        }
        for(int i=0; i<n; i++) {
            if(nums[i] < n) {
                return i;
            }
        }
        return n;
    }

}
