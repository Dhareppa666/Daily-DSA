package main.intvs.int2023_24;

import java.util.Arrays;

public class General_asked_Ques {

    public static void main(String[] args) {
        int[][] mat1 = {{3,1,4},{2,0,3}};
        int[][] mat2 = {{1,3,0},{5,2,4},{6,0,4}};

        int[][] res = new int[mat1.length][mat2[0].length];
        for(int i=0; i<mat1.length; i++) {
            for(int j=0; j<mat2[0].length; j++) {
                int sum = 0;
                for(int k=0; k<mat1[0].length; k++) {
                    sum += (mat1[i][k] * mat2[k][j]);
                }
                res[i][j] = sum;
            }
        }
        for(int i=0; i<mat1.length; i++) {
            for(int j=0; j<mat2[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
