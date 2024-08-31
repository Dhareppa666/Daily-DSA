package main.finale.leetcode;

public class Main {

    public static void main(String[] args) {
        int res = minMoves(9, 4, 4, 4, 8);
        System.out.println(res);
    }

    public static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {
        // Write your code here

        int res = helper(n, startRow, startCol, endRow, endCol, Integer.MAX_VALUE);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static boolean isValidMove(int n, int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }


    public static int helper(int n, int startRow, int startCol, int endRow, int endCol, int curr) {

        if (startRow == endRow && startCol == endCol) {
            return curr;
        }
        int[][] dir = new int[][]{{-2, -1}, {-2, 1}, {2, 1}, {2, -1}, {1, 2}, {1, -2}, {-1, -2}, {-1, 2}};
        int res = Math.min(Integer.MAX_VALUE, curr);
        for (int i = 0; i < dir.length; i++) {
            if (isValidMove(n, startRow + dir[i][0], startCol + dir[i][1])) {
                int r = helper(n,
                        startRow + dir[i][0], startCol + dir[i][1],
                        endRow, endCol, curr + 1);

                res = Math.min(res, r);
            }
        }
        return res;

    }
}
