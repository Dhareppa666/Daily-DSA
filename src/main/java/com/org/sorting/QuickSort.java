package com.org.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 320, 40, 60, 100, 15, 250, 50, 76};
        quickSort(arr, 0, arr.length-1 );
        for(int i : arr){
            System.out.print(i+":");
        }
    }

    //O(n2) and O(nlogn)
    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int location = partition(arr, start, end);
            quickSort(arr, start, location - 1);
            quickSort(arr, location + 1, end);
        }
    }

    private static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[0];
        int start = lb;
        int end = ub;
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;

        System.out.println();
        System.out.println();
        System.out.println();
        return end;
    }
}
