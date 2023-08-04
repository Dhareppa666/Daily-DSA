package org.Tech.Dose.Arrays;

import org.util.AllInOneUtils;

import java.util.Arrays;

public class Sort_0_1 {

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1,0,1,0,0,0};
        sortTheArray(arr);
        AllInOneUtils.printArr(arr);
    }


    private static void sortTheArray(int[] arr) {
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
}
