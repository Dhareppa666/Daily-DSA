package main.finale.DSA.arrays;

//2. Find the maximum and minimum element in an array.
public class Array_02 {

    public static void main(String[] args) {
        int[] arr = new int[]{999, 20, 30, 40, 50, 60, 70, 80, 5, 33, 11, 4553, 676, 43, 224, 678, 456};
        minMaxOfArray(arr);
    }

    private static void minMaxOfArray(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The min is :"+min);
        System.out.println("The max is :"+max);
    }
}
