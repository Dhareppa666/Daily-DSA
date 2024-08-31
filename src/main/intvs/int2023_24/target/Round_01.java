package main.intvs.int2023_24.target;

import java.util.Arrays;

public class Round_01 {
    //2 DSA Questions

    // Given an array of meeting time intervals where intervals[i] = [starti, endi],
    // determine if a person could attend all meetings.

    // Example 1:
    // Input: intervals = [[0,30],[5,10],[15,20]]
    // Output: false

    // Example 2:
    // Input: intervals = [[7,10],[2,4]]
    // Output: true

    // 0 <= intervals.length <= 104
    // intervals[i].length == 2
    // 0 <= starti < endi <= 106

    //[[1, 4], [2, 3], [3, 5]]
    //[[0, 5], [5, 10], [10, 15]]
    public static void main(String[][] args) {
        System.out.println("Try programiz.pro");
        int[][] intervals = {{0, 10}, {10, 20}, {20, 30}, {30, 40}, {40, 50}, {50, 60}, {60, 70}, {70, 80}, {80, 90}, {90, 100}};
        //{{0, 5}, {5, 10}, {10, 15}};//{{1, 4}, {2, 3}, {3, 5}};//{{7,10},{2,4}};//{{0,30},{5,10},{15,20}};
        boolean res = canUserAttendAllMeeting(intervals);
        System.out.println(res);
    }

    public static boolean canUserAttendAllMeeting(int[][] intervals) {
        if (intervals.length <= 1) {
            return true;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[] prevInterval = intervals[0];
        for (int index = 1; index < intervals.length; index++) {
            int[] interval = intervals[index];
            if (interval[0] < prevInterval[1]) {
                return false;
            }
            prevInterval = interval;
        }
        return true;
    }

    // Given a strings, return the longest palindromic substring
    // Example 1:
    // Input: s = "babad"
    // Output: "bab"
    // Explanation: "aba" is also a valid answer.
    // Example 2:
    // Input: s = "cbbd"
    // Output: "bb"
    // Constraints:
    // 1 <= s.length <= 1000
    // s consist of only digits and English letters.

    //"babad"
    //"dabab"
    // rec1: babad, abab ==> rec1: (babad,bab) rec2: (abad, abab)
    // rec2: abad, dabab

    private static int endingIndex = 0;

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String input = "abacdficvgdcaba";//"abcba";//"aaaa";//"babad";
        String reversedInput = new StringBuilder(input).reverse().toString();
        int longestPalindrom = getLongestPalindrom(input, reversedInput, 0, 0);
        System.out.println(longestPalindrom);
    }

    public static int getLongestPalindrom(String s1, String s2, int index1, int index2) {
        if (index1 >= s1.length() || index2 >= s2.length()) {
            return 0;
        }
        if (s1.charAt(index1) == s2.charAt(index2)) {
            return 1 + getLongestPalindrom(s1, s2, index1 + 1, index2 + 1);
        } else {
            int leftRec = getLongestPalindrom(s1, s2, index1 + 1, index2);
            int rightRec = getLongestPalindrom(s1, s2, index1, index2 + 1);
            return Math.max(leftRec, rightRec);
        }
    }
}
