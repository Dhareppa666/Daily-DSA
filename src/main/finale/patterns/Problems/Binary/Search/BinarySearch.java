package org.patterns.Problems.Binary.Search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 13, 14, 17};
        int k = 15;

        int start = 0;
        int end = arr.length - 1;

        int loc = binarySearch2(arr, start, end, k);

        if (loc == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element " + k + " Found at " + loc + " index");
        }

    }

    //1.Recursive
    private static int binarySearch(int[] arr, int start, int end, int k) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == k) {
            return mid + 1;
        } else if (arr[mid] < k) {
            return binarySearch(arr, mid + 1, end, k);
        } else {
            return binarySearch(arr, start, mid - 1, k);
        }
    }

    //Linear Solln
    private static int binarySearch2(int[] arr, int start, int end, int k) {
        int index = -1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return mid + 1;
            } else if (arr[mid] < k) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return index;
    }
}
