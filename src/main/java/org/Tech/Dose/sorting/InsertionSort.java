package org.Tech.Dose.sorting;

import org.util.AllInOneUtils;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 5, 2};
        callInsertionSort(arr);
        AllInOneUtils.printArr(arr);
    }

    private static void callInsertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while (i>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
