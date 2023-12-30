package main.finale.DSA.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 320, 40, 60, 100, 15, 250, 50, 76, 1};
        int[] arrResult = selectionSort(arr);
        for (int i : arrResult) {
            System.out.print(i + ":");
        }
    }

    private static int[] selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
