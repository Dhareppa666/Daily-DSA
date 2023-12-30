package main.finale.DSA.recursion;

public class Climbing_Stairs {

    //DP Tabulation
    //TC: O(n)
    //SC: O(n)
    public static void main(String[] args) {
        int n =3;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        int res = climbStairs(n, dp);
        System.out.println(res);
    }

    public static int climbStairs(int n, int[] dp) {
        if(n==1 || n==2) {
            return n;
        }
        if(dp[n] !=0){
            return dp[n];
        }
        dp[n] = climbStairs(n-1, dp) + climbStairs(n-2, dp);
        return dp[n];
    }

    // Recursion + Memoization
    public int climbStairs(int n) {
        int[] dp = new int[n];
        return findSum(n, dp, 0);
    }

    public int findSum(int n, int[] dp, int i) {
        if(i>n) {
            return 0;
        }
        if(i==n) {
            return 1;
        }
        if(dp[i]!=0) {
            return dp[i];
        }
        dp[i] = findSum(n, dp, i+1) + findSum(n, dp, i+2);
        return dp[i];
    }
}
