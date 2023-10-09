package main.finale.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 320, 40, 60, 100, 15, 250, 50, 76};
        int[] arrResult = insertionSort(arr);
        for (int i:arrResult) {
            System.out.print(i+":");
        }
    }

    private static int[] insertionSort(int[] arr) {
        int length = arr.length;
        for (int i=1; i<length; i++){
            int temp =arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        return arr;
    }
}
