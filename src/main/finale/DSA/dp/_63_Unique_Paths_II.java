package main.finale.DSA.dp;

public class _63_Unique_Paths_II {

    public static void main(String[] args) {
        int paths = uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}});
        System.out.println(paths);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[101][101];
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return solve(0, 0, m, n, dp, obstacleGrid);
    }

    public static int solve(int i, int j, int m, int n, int[][] dp, int[][] grid) {
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] == 1) {
            return 0;
        }
        if( i == m-1 && j== n-1) {
            return 1;
        }
        if(dp[i][j] !=0) {
            return dp[i][j];
        }

        int right = solve(i, j+1, m, n, dp, grid);
        int down = solve(i+1, j, m, n, dp, grid);

        return dp[i][j] = right + down;
    }
}
