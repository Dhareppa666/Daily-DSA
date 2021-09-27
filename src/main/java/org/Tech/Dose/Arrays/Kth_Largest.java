package org.Tech.Dose.Arrays;

public class Kth_Largest {

    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 5, 2, 1};
        System.out.println(KthLargest(arr, 0, arr.length-1, 2));
//        System.out.println(findKthLargest(arr, 0, arr.length-1, 2));
    }

    private static int KthLargest(int[] arr, int low, int high, int k) {
        if(k>=0 && k <=high-low+1){
            int pi = partition(arr, low, high);
            if (pi-low == k)
                return arr[pi];
            else if(pi-low > k)
                return partition(arr, low, pi-1);
            else
                return partition(arr, pi+1, high);
        }
        return -1;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i=(low-1);
        for(int j=1; j<=high-1; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static int findKthLargest(int[] arr, int low, int high, int k) {// quick select: kth smallest
        if (low > high) return Integer.MAX_VALUE;

        int pivot = arr[high];// Take A[high] as the pivot,
        int left = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) // Put numbers < pivot to pivot's left
                swap(arr, left++, i);
        }
        swap(arr, left, high);// Finally, swap A[high] with A[left]

        if (left == k)// Found kth smallest number
            return arr[left];
        else if (left < k)// Check right part
            return findKthLargest(arr, left + 1, high, k);
        else // Check left part
            return findKthLargest(arr, low, left - 1, k);
    }

    private static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
