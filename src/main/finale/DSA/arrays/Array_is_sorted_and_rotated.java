package main.finale.DSA.arrays;

//TODO:
public class Array_is_sorted_and_rotated {

    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,1,2}));
        System.out.println(check(new int[]{3,2,1,5,4}));
    }

    public static boolean check(int[] A) {
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the mid element is greater than the right element,
            // the minimum element must be on the right side
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // If the mid element is less than or equal to the right element,
            // the minimum element must be on the left side or equal to mid
            else {
                right = mid;
            }
        }
        // At the end of the loop, left will point to the minimum element
        return nums[left];
    }
}
