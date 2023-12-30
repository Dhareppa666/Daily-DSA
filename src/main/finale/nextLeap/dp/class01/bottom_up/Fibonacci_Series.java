package main.finale.nextLeap.dp.class01.bottom_up;

public class Fibonacci_Series {

    public static void main(String[] args) {
        int fibVal = fib(6);
        System.out.println(fibVal);
    }

    private static int fib(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}
