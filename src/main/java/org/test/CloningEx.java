package org.test;

public class CloningEx {
    public static void main(String[] args) {
        int[][] x = {{10,20,30},{40,50}};
        int[][] y = x.clone();
        printValue(x);
        System.out.println();
        printValue(y);

        y[0][1] = 777;
        y[1][1] = 777;
        System.out.println();

        printValue(x);
        System.out.println();
        printValue(y);


    }

    private static void printValue(int[][] y) {

        for(int i=0; i<y.length; i++){
            for(int j=0; j<y[i].length; j++){
                System.out.print(y[i][j]+" : ");
            }
            System.out.println();
        }
    }
}
