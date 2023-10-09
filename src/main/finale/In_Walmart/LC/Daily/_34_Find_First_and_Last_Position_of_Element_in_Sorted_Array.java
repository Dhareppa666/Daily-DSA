package main.finale.In_Walmart.LC.Daily;

// Given an array of integers nums sorted in non-decreasing order,
// find the starting and ending position of a given target value.

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]

public class _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    public static void main(String[] args) {
        int[] arr = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] res = searchRange(arr, target);
        System.out.println(res[0]+" "+res[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int left = getIndex(nums, true, target);
        int right = getIndex(nums, false, target);
        if(left!=Integer.MAX_VALUE) {
            res[0] = left;
        }
        if(right!=Integer.MIN_VALUE) {
            res[1] = right;
        }
        return res;
    }

    public static int getIndex(int[] nums, boolean isLeft, int target) {
        int left = 0;
        int right = nums.length-1;
        int index = isLeft ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        while(left<=right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                if(isLeft) {
                    index = Math.min(index, mid);
                    right = mid-1;
                } else {
                    index = Math.max(index, mid);
                    left = mid+1;
                }
            } else if(nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return index;
    }
}
