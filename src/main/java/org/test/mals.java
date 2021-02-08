package org.test;

public class mals {
    public static void main(String[] args) {
        //call();
        //call2();
        int x = call03();
        System.out.println("X is : "+x);
    }

    private static int call03() {
        int[] A = {31,32,33,34,35, 50, 17, 29, 13};
        int min = A[0];
        for(int i=0; i<A.length; i++){
            if(A[i] == 0){
                return 0;
            }
            if(min >= A[i]){
                min = A[i];
            }
        }
        return min;
    }

    private static void call2() {
        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=(n-i); j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void call() {
        int n = 20;
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
