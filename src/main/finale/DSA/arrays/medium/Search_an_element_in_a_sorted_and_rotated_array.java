package main.finale.DSA.arrays.medium;

public class Search_an_element_in_a_sorted_and_rotated_array {

    public static void main(String[] args) {
        boolean res = search(new int[]{2,5,6,0,0,1,2}, 0);
        System.out.println(res);
    }

    public static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = start+ (end-start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }
            if (nums[start]<=nums[mid]) {
                if(target >= nums[start] && target <= nums[mid]) {
                    end=mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target >= nums[mid] && target <= nums[end]) {
                    start = mid +1;
                } else {
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
