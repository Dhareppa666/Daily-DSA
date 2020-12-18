package com.org.Algos;


public class DP_vs_Recursion {

    public static void main(String[] args) {
      /*  int n1 = fib(45);
        System.out.println(n1);*/

        int[] arr = new int[100];
        for (int i=0; i<100 ; i++) {
            arr[i] = -1;
        }
        int n2 = topDownDP(6, arr);
        System.out.println(n2);

    }

    // Using Recursion.
    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) +
                fib(n - 2);
    }

    //Top Down DP + Memorization
    private static int topDownDP(int n, int[] arr) {
        if (n == 0 || n == 1) {
            arr[n] = n;
            return n;
        }
        //already computed.
        if (arr[n] != -1) {
            return arr[n];
        } else {
            // compute and store.
            arr[n-1] = fib(n - 1);
            arr[n-2] = arr[n-1] + 1;
            return arr[n];
        }
    }
}
/*
1134903170
The time is : 6581

1134903170
The time is : 4702

1134903170
The time is : 6457

1134903170
The time is : 4756
 */