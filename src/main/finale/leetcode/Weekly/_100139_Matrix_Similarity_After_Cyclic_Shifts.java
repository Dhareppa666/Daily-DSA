package main.finale.leetcode.Weekly;

public class _100139_Matrix_Similarity_After_Cyclic_Shifts {

    public static void main(String[] args) {
        int[][] mat = {{3,10,3,10,3,10,3,10},{5,8,5,8,5,8,5,8},{3,9,3,9,3,9,3,9},{3,8,3,8,3,8,3,8},{2,3,2,3,2,3,2,3}};
//        int[][] mat = {{1,2,1,2},{5,5,5,5},{6,3,6,3}};
//        int[][] mat = {{1, 2}};
        boolean res = areSimilar(mat, 2);
        System.out.println(res);
    }

    public static boolean areSimilar(int[][] mat, int k) {
        int[][] copy = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                copy[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            int rotations = k < mat[0].length ? k : k % mat[0].length;
            if (i % 2 == 0) { //even
                while (rotations > 0) {
                    int first = mat[i][0];
                    for (int x = 0; x < mat[0].length - 1; x++) {
                        mat[i][x] = mat[i][x + 1];
                    }
                    mat[i][mat[0].length - 1] = first;
                    rotations--;
                }
            } else { //odd
                while (rotations > 0) {
                    int last = mat[i][mat[0].length - 1];
                    for (int x = mat[0].length - 1; x > 0; x--) {
                        mat[i][x] = mat[i][x - 1];
                    }
                    mat[i][0] = last;
                    rotations--;
                }
            }

        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (copy[i][j] != mat[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }
}
