package main.finale.DSA.graphs.class01.check_02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class snakesAndLadders {

    public static void main(String[] args) {
        int[][] grid = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}};
        int minSteps = snakesAndLadders(grid);
        System.out.println(minSteps);
    }

    public static int snakesAndLadders(int[][] board) {
        //Step1: Convert board to hashmap to map the board cell number to cell value for easier calculation
        int n = board.length;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int start = n * n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((n - i) % 2 == 0) {
                    hm.put(start, board[i][j]);
                } else {
                    hm.put(start, board[i][n - j - 1]);
                }
                start--;
            }
        }
        // breadth-first-search
        Queue<Integer> queue = new LinkedList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        queue.add(1);
        set.add(1);  // For visited  cells
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                if (current == n * n) {    // Reached the top! winner winner chicken dinner
                    return step;
                }
                for (int j = 1; j <= 6; j++) {
                    int newPoint = current + j;
                    if (newPoint > n * n) {
                        continue;       // We are outside the board now with this choice
                    }
                    if (hm.get(newPoint) != -1) {
                        newPoint = hm.get(newPoint);    // Either snake or ladder (doesn't matter)
                    }
                    if (!set.contains(newPoint)) {
                        queue.add(newPoint);
                        set.add(newPoint);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
