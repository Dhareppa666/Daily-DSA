package java.sorting;

public class MergeSort2 {

    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 320, 40, 60, 100, 15, 250, 50, 76};
        mergeSort(arr, 0, arr.length);
        for (int i : arr) {
            System.out.print(i + ":");
        }
    }

    private static void mergeSort(int[] arr, int first, int last) {

        int mid = (first + last) /2;

        mergeSort(arr, 0, mid);
        mergeSort(arr, mid+1, last);

        Merge(arr, first, mid, last);
    }

    private static void Merge(int[] arr, int first, int mid, int last) {

    }
}
