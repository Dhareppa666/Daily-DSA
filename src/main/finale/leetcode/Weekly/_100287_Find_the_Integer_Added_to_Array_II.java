package main.finale.leetcode.Weekly;

import java.util.Arrays;

public class _100287_Find_the_Integer_Added_to_Array_II {

    public static void main(String[] args) {
        int count = minimumAddedInteger(new int[]{4,7,5}, new int[]{5});
        System.out.println(count);
    }

    public static int minimumAddedInteger(int[] nums1, int[] nums2) {
        int lMin = Integer.MIN_VALUE, n1 = Integer.MAX_VALUE, rMin = Integer.MIN_VALUE, n2 = Integer.MAX_VALUE;
        for(int i =0; i<nums1.length; i++) {
            lMin = Math.max(lMin, nums1[i]);
            n1 = Math.max(n1, nums1[i]);
        }
        for(int i =0; i<nums2.length; i++) {
            rMin = Math.max(rMin, nums2[i]);
            n2 = Math.max(n2, nums2[i]);
        }
        if(isEqual(n2 - n1, nums1, nums2)) {
            return n2 - n1;
        } else {
            return rMin - lMin;
        }
    }

    public static boolean isEqual(int i, int[] nums1, int[] nums2) {
        for(int x = 0; x<nums1.length; x++) {
            nums1[x] += i;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int count = 0, left = 0, right = 0;
        while(left<nums1.length && right < nums2.length) {
            if(nums1[left] == nums2[right]) {
                count++;
                left++;
                right++;
            } else if(nums1[left] < nums2[right]) {
                left++;
            } else {
                right++;
            }
        }
        return count == nums2.length;
    }
}
