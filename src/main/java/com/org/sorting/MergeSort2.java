package com.org.sorting;

public class MergeSort2 {

    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 320, 40, 60, 100, 15, 250, 50, 76};
        mergeSort(arr, 0, arr.length);
    }

    private static void mergeSort(int[] arr, int first, int last) {
        if (first < last){
            int mid = (first + last) / 2;

            mergeSort(arr, first, mid);
            mergeSort(arr, mid + 1, last);
            Merge(arr, first, mid, last);
        }
        /*
        for (int i : brr) {
            System.out.print(i + ":");
        }*/
    }

    private static int[] Merge(int[] arr, int first, int mid, int last) {
        int[] brr = new int[arr.length];
        int i = first;
        int j = mid+1;
        int k = last;
        while (i <= mid && j <= last) {
            if (arr[i] <= arr[j]) {
                brr[k] = arr[i];
                i++;
            } else {
                brr[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= last) {
                brr[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                brr[k] = arr[i];
                i++;
                k++;
            }
        }
        return brr;
    }
}
