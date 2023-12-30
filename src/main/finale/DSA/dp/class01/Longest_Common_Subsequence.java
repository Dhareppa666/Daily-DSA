package main.finale.DSA.dp.class01;

import java.util.Arrays;

public class Longest_Common_Subsequence {

    public static void main(String[] args) {
        int common = longestCommonSubsequence("abcde", "ace");//text1 = "abc", text2 = "abc"
        System.out.println(common);
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        // Your code goes here
        int[][] dp = new int[text1.length()][text2.length()];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return getLongestSub(0, 0, text1, text2, dp);
    }

    public static int getLongestSub(int i, int j, String text1, String text2, int[][] dp) {
        if (i >= text1.length() || j >= text2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (text1.charAt(i) == text2.charAt(j)) {
            ans = 1 + getLongestSub(i + 1, j + 1, text1, text2, dp);
        } else {
            int x = getLongestSub(i + 1, j, text1, text2, dp);
            int y = getLongestSub(i, j + 1, text1, text2, dp);
            ans = Math.max(x, y);
        }
        return dp[i][j] = ans;
    }
}
