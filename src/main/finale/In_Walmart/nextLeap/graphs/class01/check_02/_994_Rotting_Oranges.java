package main.finale.In_Walmart.nextLeap.graphs.class01.check_02;

import java.util.*;

//https://leetcode.com/problems/rotting-oranges/
public class _994_Rotting_Oranges {

    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int count = orangesRotting(grid);
        System.out.println(count);
    }

    public static int orangesRotting(int[][] grid) {
        // Your code goes here
        int m = grid.length, n = grid[0].length;
        int fresh_oranges = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh_oranges++;
                }
            }
        }
        if (fresh_oranges == 0) {
            return 0;
        }
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] peek = queue.poll();
                for (int[] arr : dirs) {
                    int x = arr[0] + peek[0];
                    int y = arr[1] + peek[1];

                    if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != 1) {
                        continue;
                    }
                    grid[x][y] = 2;
                    queue.offer(new int[]{x, y});
                    fresh_oranges--;
                }
            }
        }
        return fresh_oranges == 0 ? count - 1 : -1;
    }
}
