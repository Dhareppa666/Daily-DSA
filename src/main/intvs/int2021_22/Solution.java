package main.intvs.int2021_22;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    //Question 5: Merge two unsorted arrays into single sorted array without duplicates using stream?
    //int[] a = new int[] {4, 2, 5, 1};
    //int[] b = new int[] {8, 1, 9, 5};
    //Output : [1, 2, 4, 5, 8, 9]
    public static void main(String[] args) {
        System.out.println("test");

        int[] a = {4, 2, 5, 1};
        int[] b = {8, 1, 9, 5,2,2,2,2,2,2};

        //1,2,4,5,8,9

        Arrays.sort(a);
        Arrays.sort(b);

        int index1 = 0, index2 = 0;
        int minIndex = Math.min(a.length, b.length);

        int[] result = new int[a.length + b.length];
        int tempIndex = 0;
        for (int index = 0; index < minIndex; index++) {
            tempIndex++;
            if (a[index1] == b[index2]) {
                result[index] = a[index1];
                index1++;
                index2++;
                continue;
            }
            if (a[index1] < b[index2]) {
                result[index] = a[index1];
                index1++;
            } else {
                result[index] = b[index2];
                index2++;
            }
        }

        while (index1 < a.length) {
            result[tempIndex] = a[index1];
            index1++;
            tempIndex++;
        }

        while (index2 < b.length) {
            result[tempIndex] = b[index2];
            index2++;
            tempIndex++;
        }

        System.out.println(Arrays.toString(result));

//        ArrayList<Integer> result1 = Arrays.stream(a).toArray();
//        int[] result2 = Arrays.stream(b).
//
//        Arrays.stream(a).

//        System.out.println(Arrays.toString(result));
    }
}
