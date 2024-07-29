package main.finale.leetcode.Blind_75.merge_intervals;

import java.util.*;

public class _57_Insert_Interval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int len = intervals.length;
        int i = 0;
        while (i < len && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }

        int[] mergeInterval = { newInterval[0], newInterval[1] };
        while (i < len && intervals[i][0] <= mergeInterval[1]) {
            mergeInterval[0] = Math.min(intervals[i][0], mergeInterval[0]);
            mergeInterval[1] = Math.max(intervals[i][1], mergeInterval[1]);
            i++;
        }
        list.add(mergeInterval);

        while (i < len) {
            list.add(intervals[i]);
            i++;
        }

        return list.toArray(new int[list.size()][]);
    }
}
