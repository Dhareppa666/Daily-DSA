package org.arrays;

import org.util.AllInOneUtils;

import java.util.Arrays;

public class SortZeroOnes {

    public static void main(String[] args) {
//        int[] arr = {1,0};
//        int[] arr = {0,1,0,1};
        int[] arr = {0,1,0,1,0,0,1,0,1,0,0,0};
        Arrays.sort(arr);
//        sortTheArray(arr);
//        sortTheArray2(arr);
//        sortTheArray3(arr);
        sortTheArray4(arr);
//        sortTheArray5(arr);
        AllInOneUtils.printArr(arr);
    }

    private static void sortTheArray5(int[] arr) {//0,1,0,1,0,0
        int index=-1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 0){
                if(index !=-1){
                    index++;
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
            } else {

            }
        }
    }

    private static void sortTheArray4(int[] arr) {
        int j=-1;
        for(int i=0; i<arr.length; i++){//0,0,0,1,0
            if(arr[i] == 0){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }

    private static void sortTheArray3(int[] arr) {
        int j = -1;
        for(int i=0; i<arr.length; i++){
            if (arr[i]<1){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

    private static void sortTheArray2(int[] arr) {//1,0
        int ones = 0;
        int zeros = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                ones = i;
            }
            else if (arr[i] == 0){
                if (ones !=0){
                    arr[i] = 1;
                    arr[ones] = 0;
                    ones = i;
                }
            }
        }
    }

    /*private static void sortTheArray(int[] arr) {
        int ones = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 1)
                ones++;
        }
        //3
        int zeros = arr.length - ones;//6
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(){

            }
        }
    }*/
}
