package main.finale.leetcode.Top100;

import java.util.Arrays;

public class _91_Decode_Ways_01 {

    public static void main(String[] args) {
        int res = numDecodings("226");
        System.out.println(res);
    }

    // TOP DOWN APPROACH.......>>>>>
    // TIME: O(n)
    // SPACE: O(n)
    public static int numDecodings(String s) {
        if (s == null) {
            return 0;
        }
        int[][] dp = new int[s.length()][s.length()];
        for (int[] x : dp) {
            Arrays.fill(x, -1);
        }
        return solve(s, 0, dp);
    }

    public static int solve(String s, int i, int[][] dp) {
        if (i == s.length()) {
            return 1;
        }
        if (s.charAt(i) == '0') {
            return 0;
        }
        if (i >= s.length() - 1) {
            return 1;
        }

        if (dp[i][i] != -1) {
            return dp[i][i];
        }
        int ans = solve(s, i + 1, dp);
        if (Integer.parseInt(s.substring(i, i + 2)) <= 26) {
            ans += solve(s, i + 2, dp);
        }
        return dp[i][i] = ans;
    }
}
