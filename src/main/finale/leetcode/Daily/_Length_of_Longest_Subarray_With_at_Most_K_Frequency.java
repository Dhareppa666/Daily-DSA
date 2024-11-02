package main.finale.leetcode.Daily;

import java.util.*;

public class _Length_of_Longest_Subarray_With_at_Most_K_Frequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 3};
        int count = maxSubarrayLength(arr, 1);
        System.out.println(count);
    }

    public static int maxSubarrayLength(int[] A, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0, i = 0, n = A.length;
        for (int j = 0; j < n; ++j) {
            map.put(A[j], map.getOrDefault(A[j], 0) + 1);
            while (map.get(A[j]) > k) {
                map.put(A[i], map.get(A[i++]) - 1);
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
