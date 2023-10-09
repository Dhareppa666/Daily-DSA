package main.finale.In_Walmart.nextLeap.dp;

public class _62_Unique_Paths {

    public static void main(String[] args) {
        int paths = uniquePaths(3, 7);
        System.out.println(paths);
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[101][101];
        return solve(0, 0, m, n, dp);
    }

    public static int solve(int i, int j, int m, int n, int[][] dp) {
        if(i<0 || i>=m || j<0 || j>=n) {
            return 0;
        }
        if( i == m-1 && j== n-1) {
            return 1;
        }
        if(dp[i][j] !=0) {
            return dp[i][j];
        }

        int right = solve(i, j+1, m, n, dp);
        int down = solve(i+1, j, m, n, dp);

        return dp[i][j] = right + down;
    }
}
