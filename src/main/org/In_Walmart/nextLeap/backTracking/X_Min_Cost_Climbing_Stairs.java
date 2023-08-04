package org.In_Walmart.nextLeap.backTracking;

public class X_Min_Cost_Climbing_Stairs {

    public static void main(String[] args) {
        int[] cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        int[] dp = new int[cost.length+1];
        int res = Math.min(findCost(cost, dp, 0, cost.length), findCost(cost, dp, 1, cost.length));
        System.out.println(res);
    }

    public static int findCost(int[] cost, int[] dp, int pos, int length) {
        if(pos >=length) {
            return 0;
        }
        if(dp[pos] > 0) {
            return dp[pos];
        }
        int op1 = findCost(cost, dp, pos+1, length);
        int op2 = findCost(cost, dp, pos+2, length);
        dp[pos] = dp[pos] + Math.min(op1, op2);
        return dp[pos];
    }
}
