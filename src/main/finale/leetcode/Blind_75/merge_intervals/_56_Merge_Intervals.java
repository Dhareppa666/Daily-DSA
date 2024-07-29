package main.finale.leetcode.Blind_75.merge_intervals;

import java.util.*;
import java.util.Arrays;

public class _56_Merge_Intervals {

    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();
        int[] prev = intervals[0];
        list.add(prev);

        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                prev = curr;
                list.add(prev);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
