package main.finale.Tech.Dose.Arrays;

import java.util.Arrays;

//Time complexity: O(n log n)
//Space complexity: O(n)
//Sort ascending and descending order.
public class twoWaySort {

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 7, 5, 4};
        twoWaySortArr(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void twoWaySortArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) != 0)
                arr[i] *= -1;
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) != 0)
                arr[i] *= -1;
        }
    }
}
