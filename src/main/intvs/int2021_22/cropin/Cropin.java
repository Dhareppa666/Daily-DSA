package main.intvs.int2021_22.cropin;

public class Cropin {

    /**
     * Main mathod.
     *
     * @param args args from CLI.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55};
        int n = arr.length;
        printMaxMinFromArray(arr, n);
        //Space Complexity : O(1)
        //Time Complexity  : O(n)
    }

    /**
     * This method is responsible for printing min and max sum from the given array.
     *
     * @param arr input array.
     * @param n   length of an input array.
     */
    private static void printMaxMinFromArray(int[] arr, int n) {
        long sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }
        System.out.println("The Minimum Sum is: " + min);
        System.out.println("The Maximum Sum is: " + max);
    }

}
