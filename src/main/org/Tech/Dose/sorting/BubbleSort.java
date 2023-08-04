package org.Tech.Dose.sorting;

import org.util.AllInOneUtils;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,6,4,4};
//        int[] arr = {1,6,9,4,4,7,7,4,5,2};
        callBubbleSort(arr);
        AllInOneUtils.printArr(arr);
    }

    private static void callBubbleSort(int[] arr) {
        for (int i = 0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]>=arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
