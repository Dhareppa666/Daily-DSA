package main.finale.DSA.arrays;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        System.out.println(Arrays.toString(sortArrayByParity.sortArrayByParity(new int[]{1,3,5,2,4})));
    }

    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        for (int j = 0; j < A.length; j++)//==>[1,3,5,2,4]
            if (A[j] % 2 == 0) {
                int tmp = A[i];
                A[i++] = A[j];
                A[j] = tmp;;
            }
        return A;
    }
}
