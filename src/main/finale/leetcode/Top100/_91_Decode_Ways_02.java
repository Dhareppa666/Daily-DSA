package main.finale.leetcode.Top100;

public class _91_Decode_Ways_02 {

    public static void main(String[] args) {
        int res = numDecodings("226");
        System.out.println(res);
    }

    // BOTTOM UP APPROACH.......>>>>>
    // TIME: O(n)
    // SPACE: O(1)
    public static int numDecodings(String s) {
        if (s == null || s.charAt(0) == '0') {
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;// empty string
        dp[1] = s.charAt(0) == '0' ? 0 : 1;// first char

        for (int i = 2; i <= s.length(); i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            int num = Integer.parseInt(s.substring(i - 2, i));
            if (s.charAt(i - 2) != '0' && num <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}
