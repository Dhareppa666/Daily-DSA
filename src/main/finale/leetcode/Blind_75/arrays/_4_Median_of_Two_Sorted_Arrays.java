package main.finale.leetcode.Blind_75.arrays;

//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class _4_Median_of_Two_Sorted_Arrays {

    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numsLen1 = nums1.length;
        int numsLen2 = nums2.length;
        int idx1 = 0, idx2 = 0, mid1 = 0, mid2 = 0;

        // Find Median.
        for (int count = 0; count <= (numsLen1 + numsLen2) / 2; count++) {
            mid2 = mid1;
            if (idx1 != numsLen1 && idx2 != numsLen2) {
                if (nums1[idx1] > nums2[idx2]) {
                    mid1 = nums2[idx2++];
                } else {
                    mid1 = nums1[idx1++];
                }
            } else if (idx1 < numsLen1) {
                mid1 = nums1[idx1++];
            } else {
                mid1 = nums2[idx2++];
            }
        }

        if ((numsLen1 + numsLen2) % 2 == 1) {
            return (double) mid1;
        } else {
            double ans = (double) mid1 + (double) mid2;
            return ans / 2.0;
        }
    }
}
