package main.intvs.int2023_24.goldman2;

public class Round2 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[][]  arr = {
                {1,1,1,0,0,1},
                {1,0,1,1,0,1},
                {0,1,1,0,1,0},
                {1,1,0,0,1,0},
                {0,1,0,1,1,1},
                {1,0,0,1,0,1}};
        int landMass = 0, rowLen = arr.length, colLen = arr[0].length;

        for(int row = 0; row < rowLen; row++) {
            for(int col = 0; col < colLen; col++) {
                if(arr[row][col] == 1) {
                    int newLandMass = dfs(arr, row, col, rowLen, colLen);
                    landMass = Math.max(landMass, newLandMass);
                }
            }
        }

        System.out.println("The maximum Land Mass is: "+ landMass);
    }

    public static int dfs(int[][] grid, int row, int col, int rowLen, int colLen) {
        if(row < 0 || col <0 || row>=rowLen || col >= colLen) {
            return 0;
        }
        if(grid[row][col] == 0 || grid[row][col] == 2) {
            return 0;
        }
        grid[row][col] = 2;
        int leftDir = dfs(grid, row, col-1, rowLen, colLen);
        int rightDir = dfs(grid, row, col+1, rowLen, colLen);
        int topDir = dfs(grid, row-1, col, rowLen, colLen);
        int bottomDir = dfs(grid, row+1, col, rowLen, colLen);

        return 1 + leftDir + rightDir + topDir + bottomDir;
    }
}
