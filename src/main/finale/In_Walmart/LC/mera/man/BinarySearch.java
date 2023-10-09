package main.finale.In_Walmart.LC.mera.man;

public class BinarySearch {

    public static void main(String[] args) {
        Integer res = searchInsert(new int[]{1,3,5,6}, 0);
        System.out.println(res);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right=nums.length-1;//2,2
        while(left < right){
            int mid = left + ((right-left)/2);
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid] < target){
                left=mid+1;
            } else {
                right = mid;
            }
        }
        return nums[left] < target ? left+1 : left;
    }
}
