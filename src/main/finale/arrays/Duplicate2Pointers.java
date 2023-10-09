package main.finale.arrays;

import main.finale.util.AllInOneUtils;

import java.util.Arrays;

public class Duplicate2Pointers {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 6};
        removeDuplicates(arr);
        AllInOneUtils.printArr(arr);
    }

    private static void removeDuplicates(int[] arr) {
        int last = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != last) {
                arr[++index] = arr[i];
                last = arr[i];
            }
        }
        for (int i = ++index; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}
