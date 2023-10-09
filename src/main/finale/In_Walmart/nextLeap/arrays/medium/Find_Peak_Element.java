package main.finale.In_Walmart.nextLeap.arrays.medium;

public class Find_Peak_Element {

    public static void main(String[] args) {
        int res = findPeakElement(new int[]{1,2,1,3,5,6,4});
        System.out.println(res);
    }

    public static int findPeakElement(int[] nums) {
        // Your code goes here
        int left =0, right = nums.length-1;
        while(left<right) {
            int mid = left + (right-left) /2;
            if(nums[mid] > nums[mid+1]) {
                right = mid;
            } else {
                left = mid +1;
            }
        }
        return left;
    }
}
