package main.finale.In_Walmart.nextLeap.HeapAndQueue;

import java.util.Arrays;

public class Meeting_Rooms_I {

    // Solln with O(nLogn)
    public boolean canAttendMeetings1(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0; i<intervals.length-1; i++) {
            if(intervals[i][1] > intervals[i+1][0]) {
                return false;
            }
        }
        return true;
    }

    // Solln with O(n^2)
    public boolean canAttendMeetings(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (overlap(intervals[i], intervals[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean overlap(int[] interval1, int[] interval2) {
        return (interval1[0] >= interval2[0] && interval1[0] < interval2[1])
                || (interval2[0] >= interval1[0] && interval2[0] < interval1[1]);
    }
}
