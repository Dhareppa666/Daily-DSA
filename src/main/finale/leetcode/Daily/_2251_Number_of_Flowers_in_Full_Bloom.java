package main.finale.leetcode.Daily;

import java.util.Arrays;

public class _2251_Number_of_Flowers_in_Full_Bloom {

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] first = new int[flowers.length];
        int[] second = new int[flowers.length];
        for(int i=0; i<flowers.length; i++) {
            first[i] = flowers[i][0];
            second[i] = flowers[i][1];
        }
        Arrays.sort(first);
        Arrays.sort(second);

        int[] res = new int[people.length];
        for(int i=0; i<res.length; i++) {
            int bloom = getIndex1(first, people[i]);
            int died = getIndex2(second, people[i]);
            res[i] =  bloom - died;
        }

        return res;
    }

    public int getIndex1(int[] arr, int element) {
        int left =0, right=arr.length;
        while(left<right) {
            int mid = left + (right-left) /2;
            if (arr[mid] <= element) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int getIndex2(int[] arr, int element) {
        int left =0, right=arr.length;
        while(left<right) {
            int mid = left + (right-left) /2;
            if (arr[mid] < element) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
