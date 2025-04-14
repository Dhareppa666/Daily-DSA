package main.finale.CSES.DP;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Dice_Combinations {

    private static final long modulo = 1000_000_000L + 7L;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        long[] dp = new long[i + 1];
        Arrays.fill(dp, -1);
        long newRes = call2(i, dp);
        System.out.println("new res:" + (newRes % modulo));
        int res = (int) (call(i, dp) % modulo);
        System.out.println(res);
    }

    private static long call2(int n, long[] dp) {
        if (dp[n] != -1L) {
            return dp[n];
        }
        long count = 0;
        for (int i = 1; i <= 6; i++) {
            if (n >= i)
                count += call(n - i, dp);
        }
        return dp[n] = count;
    }

    private static long call(int n, long[] dp) {
        if (n == 0L) {
            return 1L;
        } else if (n < 0L) {
            return 0L;
        }
        if (dp[n] != -1L) {
            return dp[n];
        }
        long count = 0;
        for (int i = 1; i <= 6; i++) {
            if (n >= i)
                count += call(n - i, dp);
        }
        return dp[n] = count;
    }
}
