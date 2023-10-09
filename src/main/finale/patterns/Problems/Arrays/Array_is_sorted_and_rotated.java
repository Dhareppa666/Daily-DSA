package main.finale.patterns.Problems.Arrays;

//TODO:
public class Array_is_sorted_and_rotated {

    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,1,2}));
        System.out.println(check(new int[]{3,2,1,5,4}));
    }

    public static boolean check(int[] A) {
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}
