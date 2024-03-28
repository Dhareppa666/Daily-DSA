package main.finale.leetcode.Daily;

public class _713_Subarray_Product_Less_Than_K {

    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int count = numSubarrayProductLessThanK(arr, 100);
        System.out.println(count);
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int left = 0, i = 0, curr = 1;
        while (i < nums.length ) {
            curr = curr * nums[i];
            while(curr >= k && left <= i) {
                curr = curr / nums[left];
                left++;
            }
            count+=(i-left+1);
            i++;
        }
        return count;
    }
}
