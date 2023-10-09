package main.finale.Tech.Dose.Arrays;

import main.finale.util.AllInOneUtils;

public class Max_occurance_of_Number {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 1, 1, 1, 1, 1, 1, 0};
        maxOccurance(arr);
        //AllInOneUtils.printArr(arr);
    }

    private static void maxOccurance(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int occurance = 1;
        int max = Integer.MIN_VALUE;
        int max_key = Integer.MIN_VALUE;
        int key = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == key) {
                occurance++;
            } else {
                occurance = 1;
                key = arr[i];
            }
            if (occurance > max) {
                max = occurance;
                max_key = arr[i];
            }
        }
        System.out.println("Key:" + max_key + " repeated:" + max);
    }
}
