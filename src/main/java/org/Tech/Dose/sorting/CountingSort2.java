package org.Tech.Dose.sorting;

public class CountingSort2 {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 4, 3, 0, 8, 0, 0, 0, 0};

        countNoOfOccurance(arr);
    }

    private static void countNoOfOccurance(int[] arr) {
        int[] result = new int[10];

        for (int i = 0; i < arr.length; i++) {
            ++result[arr[i]];
        }

        // Print Frequency of characters
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println(i + " --> " + result[i]);
            }
        }
    }
}
