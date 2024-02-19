package main.finale.leetcode.Weekly;

public class _27th_Feb_24 {

    public static void main(String[] args) {
        int[] arr = {3,2,1,2,3,4};
        System.out.println(maxOperations(arr));
    }

    public static int maxOperations(int[] nums) {
        return Math.max(
                Math.max(helper(nums, 0, 1, 0, nums[0] + nums[1] ),
                        helper(nums, 0, nums.length-1, 0, nums[0]+nums[nums.length-1])
                ),
                helper(nums, nums.length-2, nums.length-1, 0, nums[nums.length-2] + nums[nums.length-1]));

    }

    public static int helper(int[] nums, int left, int right, int res, int sum) {
        if(left < 0 || left >= nums.length || right < 0 || right>=nums.length) {
            return res;
        }
        if(sum == nums[left] + nums[right]) {
            res++;
        }
        sum = nums[left] + nums[right];
        int firstTwo = Math.max(res, helper(nums, left+2, right+2, res, sum));
        int lastTwo = Math.max(res, helper(nums, right-2, right-1, res, sum));
        int firstAndLast = Math.max(res, helper(nums, left+1, right-1, res, sum));
        return Math.max(Math.max(firstTwo, lastTwo), firstAndLast);
    }
}
