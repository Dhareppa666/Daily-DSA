package main.finale.leetcode.Blind_75.merge_intervals;

import java.util.Arrays;

public class _435_Erase_Overlap_Intervals {

    public static void main(String[] args) {
        int[][] intervals = {{-52, 31}, {-73, -26}, {82, 97},
                {-65, -11}, {-62, -49}, {95, 99},
                {58, 95}, {-31, 49}, {66, 98},
                {-63, 2}, {30, 47}, {-40, -26}};
        int res = eraseOverlapIntervals(intervals);
        System.out.println(res);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
//        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        Arrays.sort(intervals, (a, b) -> a[1]-b[1]);
        for (int[] x : intervals) {
            System.out.println(Arrays.toString(x));
        }
        int count = 0;
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (curr[0] < prev[1]) {
                count++;
            } else {
                prev = curr;
            }
        }
        return count;
    }
}
//[-73, -26]
//[-65, -11]
//[-63, 2]
//[-62, -49]
//[-52, 31]
//[-40, -26]
//[-31, 49]
//[30, 47]
//[58, 95]
//[66, 98]
//[82, 97]
//[95, 99]
