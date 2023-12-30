package main.finale.leetcode;

import java.util.Arrays;

//6204. Largest Positive Integer That Exists With Its Negative
public class Largest_Positive_Integer {

    public static void main(String[] args) {
        int arr[] = {-104,-449,-318,-930,-195,579,-410,822,-814,-388,-863,174,-814,919,-877,993,741,741,-623,-4,-4,542,997,239,447,-317,409,-487,-34,6,-914,607,-622,915,573,666,-229,165,841,-820,703};
        int res = findMaxK(arr);
        System.out.println(res);
    }

    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l=0, r=nums.length-1;
        while(l<r){
            if(nums[l] == nums[r]){
                l++;
            }else if(Math.abs(nums[l]) == Math.abs(nums[r])){
                return nums[r];
            } else if(Math.abs(nums[l]) < Math.abs(nums[r])) {
                r--;
            } else {
                l++;
            }
        }
        return -1;
    }
}
