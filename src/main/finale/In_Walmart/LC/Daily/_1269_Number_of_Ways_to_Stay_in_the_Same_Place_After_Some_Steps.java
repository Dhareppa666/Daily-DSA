package main.finale.In_Walmart.LC.Daily;

//https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/?envType=daily-question&envId=2023-10-15
public class _1269_Number_of_Ways_to_Stay_in_the_Same_Place_After_Some_Steps {

    public int numWays(int steps, int arrLen) {
        int maxPos = Math.min(steps, arrLen);
        long[][] dp = new long[steps + 1][maxPos + 1];

        dp[1][0] = 1;
        dp[1][1] = 1;
        for (int i = 2; i <= steps; i++) {
            for (int j = 0; j < maxPos; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j + 1] + (j > 0 ? dp[i - 1][j - 1] : 0)) % 1000000007;
            }
        }

        return (int) dp[steps][0];
    }

    public int numWays2(int steps, int arrLen) {
        int m = steps;
        int n = Math.min(steps / 2 + 1, arrLen);

        int[][] dp = new int[m + 1][n];
        dp[0][0] = 1;

        int mod = 1000000007;

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod;
                }
                if (j < n - 1) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        return dp[m][0];
    }
}
