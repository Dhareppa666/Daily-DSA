package org.Tech.Dose.sorting;

import org.util.AllInOneUtils;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 7, 3, 1, 2};
        quickSort(arr, 0, arr.length - 1);
        AllInOneUtils.printArr(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[p] is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);// Index of smaller element and indicates the right position of pivot found so far

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {// If current element is smaller than the pivot
                i++;// Increment index of smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
