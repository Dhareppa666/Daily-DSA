package org.Tech.Dose.Arrays;

//Find Minimum in Rotated Sorted Array
public class Find_Minimum_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
