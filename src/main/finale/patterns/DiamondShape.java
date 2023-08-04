package org.patterns;

public class DiamondShape {

    public static void main(String[] args) {
        int row = 5;
        int space = row-1;
        for (int i=1; i<=row; i++){
            for(int j= 1; j<=space-1; j++)
                System.out.print(" ");
            space--;
            for(int j= 1; j<=(2*i)-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

}
