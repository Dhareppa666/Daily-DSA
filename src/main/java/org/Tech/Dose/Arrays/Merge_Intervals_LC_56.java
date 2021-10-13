package org.Tech.Dose.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Sorting takes O(n log(n)) and merging the intervals takes O(n).
// So, the resulting algorithm takes O(n log(n)).
public class Merge_Intervals_LC_56 {

    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> list = new LinkedList<>();
        int[] newInterval = intervals[0];
        list.add(newInterval);//1,5
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else {
                newInterval = interval;
                list.add(newInterval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
