package org.Tech.Dose.sorting;

import org.util.AllInOneUtils;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,6,9,4,4,7,7,4,5,2};
        callSelectionSort(arr);
        AllInOneUtils.printArr(arr);
    }

    private static void callSelectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int min = i;
            for (int j=i+1; j< arr.length; j++){
                if(arr[j] < arr[min]){
                    min= j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
