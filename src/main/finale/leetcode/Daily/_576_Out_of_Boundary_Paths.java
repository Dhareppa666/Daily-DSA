package main.finale.leetcode.Daily;

import java.util.Arrays;

public class _576_Out_of_Boundary_Paths {

    private static final int kMod = 1_000_000_007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        Integer[][][] mem = new Integer[maxMove + 1][m][n];
        return findPaths(m, n, maxMove, startRow, startColumn, mem);
    }

    // Returns the number of paths to move the ball at (i, j) out-of-bounds with k moves.
    private int findPaths(int m, int n, int k, int i, int j, Integer[][][] dp) {
        if (i < 0 || i == m || j < 0 || j == n) return 1;
        if (k == 0) return 0;
        if (dp[k][i][j] != null) return dp[k][i][j];
        dp[k][i][j] = (int) ((findPaths(m, n, k - 1, i + 1, j, dp) * 1L +
                findPaths(m, n, k - 1, i - 1, j, dp) +
                findPaths(m, n, k - 1, i, j + 1, dp) +
                findPaths(m, n, k - 1, i, j - 1, dp)) % kMod);

        return dp[k][i][j];
    }

     public int findPaths2(int m, int n, int maxMove, int startRow, int startColumn) {
         int count = 0;
         for (int i = 1; i <= maxMove; i++) {
             int[][] dp = new int[m][n];
             for (int[] a : dp) {
                 Arrays.fill(a, -1);
             }
             count += bfs(m, n, maxMove, startRow, startColumn, i, dp);
         }
         return count;
     }

     public int bfs(int m, int n, int maxMove, int startRow, int startColumn, int currMoves, int[][] dp) {
         if (startRow < 0 || startColumn < 0 || startRow >= m || startColumn >= n) {
             if (currMoves == 0) {
                 return 1;
             } else {
                 return 0;
             }
         }
         if (currMoves <= 0) {
             return 0;
         }
         if (dp[startRow][startColumn] != -1) {
             return dp[startRow][startColumn];
         }
         int left = bfs(m, n, maxMove, startRow, startColumn - 1, currMoves - 1, dp);
         int right = bfs(m, n, maxMove, startRow, startColumn + 1, currMoves - 1, dp);
         int top = bfs(m, n, maxMove, startRow - 1, startColumn, currMoves - 1, dp);
         int bottom = bfs(m, n, maxMove, startRow + 1, startColumn, currMoves - 1, dp);
         return dp[startRow][startColumn] = left + right + top + bottom;
     }
}
