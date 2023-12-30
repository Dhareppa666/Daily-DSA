package main.finale.DSA.graphs.class01.check_02;

//https://leetcode.com/problems/number-of-closed-islands/description/
public class _1254_Number_of_Closed_Islands {

    public int closedIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i * j == 0 || i == m - 1 || j == n - 1) && grid[i][j] == 0) {
                    dfs(i, j, grid);
                }
            }
        }
        int count = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] == 0) {
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j, int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != 0) {
            return;
        }
        grid[i][j] = 1;
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);
        dfs(i - 1, j, grid);
        dfs(i + 1, j, grid);
    }
}
