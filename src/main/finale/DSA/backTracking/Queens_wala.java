package main.finale.DSA.backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Queens_wala {

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> res = solveNQueens(n);
        System.out.println(res);
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List<List<String>> res = new ArrayList<List<String>>();
        dfs(board, 0, res);
        return res;
    }

    private static void dfs(char[][] board, int colIndex, List<List<String>> res) {
        if (colIndex == board.length) {
            res.add(construct(board));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '.';
            }
        }
    }

    private static boolean validate(char[][] board, int rowIdx, int colIdx) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < colIdx; j++) {
                if (board[i][j] == 'Q' && (rowIdx + j == colIdx + i || rowIdx + colIdx == i + j || rowIdx == i))
                    return false;
            }
        }

        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

}
