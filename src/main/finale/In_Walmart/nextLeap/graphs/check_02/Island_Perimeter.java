package main.finale.In_Walmart.nextLeap.graphs.check_02;

//The perimeter is the 16 yellow stripes in the image above
public class Island_Perimeter {

    public int islandPerimeter(int[][] grid) {
        // Your code goes here
        int m = grid.length, n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area1 = getArea(i + 1, j, grid, m, n);
                    int area2 = getArea(i - 1, j, grid, m, n);
                    int area3 = getArea(i, j + 1, grid, m, n);
                    int area4 = getArea(i, j - 1, grid, m, n);
                    int x = 4 - (area1 + area2 + area3 + area4);
                    max += x;
                }
            }
        }
        return max;
    }

    public int getArea(int i, int j, int[][] grid, int m, int n) {
        if (i >= 0 && i < m && j >= 0 && j < n) {
            return grid[i][j];
        }
        return 0;
    }

}
