package main.finale.DSA.backTracking;

public class Queens_wala {

    public static void main(String[] args) {
        int n = 5;
        int[][] mat = new int[n][n];
        nQueens(mat, 0, n);
    }

    private static void nQueens(int[][] mat, int row, int n) {
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 1) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println("");
            }
            System.out.println();
            System.out.println();
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValidate(mat, row, col, n)) {
                mat[row][col] = 1;
                nQueens(mat, row + 1, n);
                mat[row][col] = 0;
            }
        }
        return;
    }

    private static boolean isValidate(int[][] mat, int i, int j, int n) {
        int x = i;
        while (x >= 0) {
            if (mat[x][j] == 1) {
                return false;
            }
            x--;
        }

        int x1 = i, y1 = j;
        while (x1 >= 0 && y1 >= 0) {
            if (mat[x1][y1] == 1) {
                return false;
            }
            x1--;
            y1--;
        }

        int x2 = i, y2 = j;
        while (x2 >= 0 && y2 < n) {
            if (mat[x2][y2] == 1) {
                return false;
            }
            x2--;
            y2++;
        }
        return true;
    }
}
