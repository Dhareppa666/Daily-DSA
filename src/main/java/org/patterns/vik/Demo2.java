package org.patterns.vik;

public class Demo2 {
    public static void main(String[] args) {
        print(5);

    }

    private static void print(int n) {
        for(int i=1; i<=n*2; i++){
            int temp = i;
            i = i%n;
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
            i=temp;
        }
    }
}
