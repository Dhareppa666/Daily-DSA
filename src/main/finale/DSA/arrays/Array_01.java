package main.finale.DSA.arrays;

//1. Reverse the array.
public class Array_01 {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 22, 33, 11, 4553, 676, 43, 224, 678, 456};
        int[] arr2 = new int[]{10, 20, 30, 40, 50, 60};
        reverseAnArray01(arr, arr.length);
        System.out.println();
        reverseAnArray02(arr, arr.length);
    }

    //01- approach
    private static void reverseAnArray01(int[] arr, int length) {
        int[] brr = new int[length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            brr[j] = arr[i];
            j++;
        }
        for (int i : brr) {
            System.out.print(i + ":");
        }
    }

    //10,20,30,40,50
    //10,20,30,40,50,60,70
    //02- approach
    private static void reverseAnArray02(int[] arr, int length) {
        int start = 0;
        int end = length-1;
        int mid = (start + end) / 2;
        for (int i = 0; i < arr.length/2; i++) {
            if (i != mid){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++; end--;
            } else if ( i == mid && length%2 ==0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++; end--;
            }
        }
        for (int i : arr) {
            System.out.print(i + ":");
        }

    }
}
