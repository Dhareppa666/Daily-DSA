package org.patterns.vik;

public class Demo {

    public static void main(String[] args) {
        //print(5);
        print2(5);
    }

    private static void print2(int n) {
        n = n*2;
        for(int i=1; i<=n/2; i++){
            for(int j=0; j<(n/2)-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void print(int n) {
        //n=n*2;
        for(int i=n; i>0; i--){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
