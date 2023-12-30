package main.finale.leetcode.Daily;

public class SpiralMatrix {

    public static void main(String[] args) {
        generateMatrix(3);

    }

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int index = 1;
        int start = 0, end = n-1, up =0, down = n-1;
        while(index <= n*n ){
            for(int i=start; i<=end; i++) {
                res[up][i] = index++;
            }
            for(int i=up+1; i<=down-1; i++) {
                res[i][end] = index++;
            }
            for(int i=down; i>=start; i--) {
                res[down][i] = index++;
            }
            for(int i=down-1; i>=up+1; i--) {
                res[i][start] = index++;
            }
            start++; end--; up++; down--;
        }
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
        return res;
    }
}
