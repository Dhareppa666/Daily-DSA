package org.test;

public class mals {
    public static void main(String[] args) {
        call();
        //call2();
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
