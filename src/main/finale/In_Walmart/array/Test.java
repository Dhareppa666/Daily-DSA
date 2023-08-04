package org.In_Walmart.array;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(Arrays.toString(test.sortArrayByParity(new int[]{1,3,5 ,2,4})));
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
