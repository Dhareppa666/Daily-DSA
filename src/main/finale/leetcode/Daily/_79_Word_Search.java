package main.finale.leetcode.Daily;

public class _79_Word_Search {

    public static void main(String[] args) {
//        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        String word = "ABCCED";
        char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String word = "ABCESEEEFS";
        boolean isWordExist = exist(board, word);
        System.out.println(isWordExist);
    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] visited = new boolean[board.length][board[0].length];
                if (helper(board, i, j, word, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean helper(char[][] board, int r, int c, String word, int idx, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) {
            return false;
        }
        if (word.charAt(idx) != board[r][c] || visited[r][c] == true) {
            return false;
        }
        if (word.charAt(idx) == board[r][c] && idx == word.length() - 1) {
            return true;
        }
        visited[r][c] = true;
        boolean left = helper(board, r, c - 1, word, idx + 1, visited);
        boolean right = helper(board, r, c + 1, word, idx + 1, visited);
        boolean top = helper(board, r - 1, c, word, idx + 1, visited);
        boolean down = helper(board, r + 1, c, word, idx + 1, visited);
        visited[r][c] = false;
        return left || right || top || down;
    }
}
