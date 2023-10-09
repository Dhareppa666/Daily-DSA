package main.finale.In_Walmart.nextLeap.HeapAndQueue;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap
        for (int i = n - 1; i >= 0; i--) {
            // Move the current root (maximum) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize the largest element as the root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If the left child is larger than the root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If the right child is larger than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest is not the root
        if (largest != i) {
            // Swap the root and the largest
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Heapify the subtree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array: " + Arrays.toString(arr));

        heapSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}