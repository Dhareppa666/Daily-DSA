package main.finale.In_Walmart.nextLeap.recursion;

public class Climbing_Stairs {

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
}
