package main.finale.DSA.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {20, 10, 40, 30};
        int[] arrResult = mergeSort(arr);
        for (int i : arrResult) {
            System.out.print(i + ",");
        }
    }

    public static int[] mergeSort(int[] nums) {
        if(nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i];
                i++;
            } else {
                mix[k++] = second[j];
                j++;
            }
        }

        while (i < first.length) {
            mix[k++] = first[i];
            i++;
        }

        while (j < second.length) {
            mix[k++] = second[j];
            j++;
        }

        return mix;
    }
}
