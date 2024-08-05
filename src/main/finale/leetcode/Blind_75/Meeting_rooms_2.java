package main.finale.leetcode.Blind_75;

import java.util.Arrays;

public class Meeting_rooms_2 {

    public static void main(String[] args) {
//        int[][] input = {{0, 30},{5, 10},{15, 20}};
        int[][] input = {{0, 30}, {5, 10}, {10, 15}};
        int meetingRooms = getMinimumNumberOfMeetingRooms(input);
        System.out.println("Total Number of Meeting Rooms required are: " + meetingRooms);
    }

    public static int getMinimumNumberOfMeetingRooms(int[][] meetings) {
        int max = Integer.MIN_VALUE, count = 0;
        int[] start = new int[meetings.length];
        int[] end = new int[meetings.length];
        for (int i = 0; i < meetings.length; i++) {
            start[i] = meetings[i][0];
            end[i] = meetings[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0, j = 0;
        while (i < meetings.length) {
            if (start[i] < end[j]) {
                count++;
                i++;
            } else if (start[i] >= end[j]) {
                count--;
                j++;
            }
            max = Math.max(max, count);
        }
        return count;
    }
}
