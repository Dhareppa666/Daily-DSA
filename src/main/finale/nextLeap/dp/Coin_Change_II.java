package main.finale.nextLeap.dp;

import java.util.Arrays;

public class Coin_Change_II {

    public static void main(String[] args) {
        int res = change(5, new int[]{1, 2, 5});
        System.out.println(res);
    }

    public static int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return rec(coins, 0, amount, dp);
    }

    public static int rec(int[] coins, int index, int amount, int[][] dp) {
        if (index >= coins.length) {
            return 0;
        }
        if (amount == 0) {
            return 1;
        }
        if (dp[index][amount] != -1) {
            return dp[index][amount];
        }
        if (coins[index] > amount) {
            return rec(coins, index + 1, amount, dp);
        }
        int skip = rec(coins, index + 1, amount, dp);
        int take = rec(coins, index, amount - coins[index], dp);
        return dp[index][amount] = skip + take;
    }
}
