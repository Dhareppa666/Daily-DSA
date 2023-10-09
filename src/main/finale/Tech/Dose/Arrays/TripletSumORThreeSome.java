package main.finale.Tech.Dose.Arrays;

import java.util.HashSet;

public class TripletSumORThreeSome {

    public static void main(String[] args) {
        //Three SOme
        int arr[] = {1, 4, 45, 6, 10, 8};// O(n^2)
        threeSum(arr, 22);
        System.out.println("----------------");
        //Two SUm
        int[] arr2 = {1, 2, 3, 4, 5, 6, 10}; //O(n)
        twoSum(arr2, 11);
    }

    public static void threeSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            int curr_sum = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (set.contains(curr_sum - arr[j])) {
                    System.out.println("Triplets are:" + arr[i] + " " + arr[j] + " " + (curr_sum - arr[j]));
                }
                set.add(arr[j]);
            }
        }
    }

    public static void twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int curr_sum = target - arr[i];
            if (set.contains(curr_sum)) {
                System.out.println("Pairs Sums are:" + arr[i] + " " + (curr_sum));
            }
            set.add(arr[i]);
        }
    }
}
