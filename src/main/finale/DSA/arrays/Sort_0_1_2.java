package main.finale.DSA.arrays;

import main.finale.aa.Java.file_handling.AllInOneUtils;

public class Sort_0_1_2 {

    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 2, 1, 0};
        int[] arr = {2,1,2, 1, 0};
        sort012(arr);
        AllInOneUtils.printArr(arr);
    }

    private static void sort012(int[] arr) {
        int low = 0, mid = 0, temp = Integer.MAX_VALUE, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
