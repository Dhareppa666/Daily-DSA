package main.finale.nextLeap.graphs.class01.check_02;

// https://leetcode.com/problems/max-area-of-island/
public class Max_Area_of_Island {

    public static void main(String[] args) {
        int[][] mat = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int res = maxAreaOfIsland(mat);
        System.out.println(res);
    }

    public static int maxAreaOfIsland(int[][] grid) {
        // Your code goes here
        int m = grid.length, n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = getArea(i, j, grid, m, n);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    public static int getArea(int i, int j, int[][] grid, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int up = getArea(i - 1, j, grid, m, n);
        int down = getArea(i + 1, j, grid, m, n);
        int left = getArea(i, j - 1, grid, m, n);
        int right = getArea(i, j + 1, grid, m, n);
        return up + down + left + right + 1;

    }
}
