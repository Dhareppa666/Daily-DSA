package org.patterns.vik;

public class Demo {

    public static void main(String[] args) {
        print(5);

    }

    private static void print(int n) {
        n=n*2;
        for(int i=n; i>n/2; i--){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
