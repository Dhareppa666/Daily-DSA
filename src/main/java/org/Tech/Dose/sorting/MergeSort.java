package org.Tech.Dose.sorting;

import org.util.AllInOneUtils;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1,6,9,4,4,7,7,4,5,2};
        callMergeSort(arr, 0, arr.length-1);
        AllInOneUtils.printArr(arr);
    }

    private static void callMergeSort(int[] arr, int l, int r) {
        if(l<r){
            int mid = l+(r-l)/2;
            callMergeSort(arr, l, mid);
            callMergeSort(arr, mid+1, r);
            //call Merge the sorted arrs
            mergeSortedArr(arr, l, mid, r);
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    private static void mergeSortedArr(int[] arr, int l, int mid, int r) {
        // Find sizes of two subarrays to be merged
        int n1=mid-l+1;
        int n2=r-mid;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];




    }

}
