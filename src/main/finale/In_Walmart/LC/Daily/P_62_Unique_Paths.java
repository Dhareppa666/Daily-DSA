package main.finale.In_Walmart.LC.Daily;

//https://leetcode.com/problems/unique-paths/
public class P_62_Unique_Paths {

    //Input: m = 3, n = 7
    //Output: 28
    //Example 2:
    //
    //Input: m = 3, n = 2
    //Output: 3
    //Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
    //1. Right -> Down -> Down
    //2. Down -> Down -> Right
    //3. Down -> Right -> Down

    public static void main(String[] args) {
        P_62_Unique_Paths t = new P_62_Unique_Paths();

        int m=3, n=7;

        int res = t.uniquePaths(m,n); //1. Recursion
        System.out.println("The possible ways are: "+res);

        ////////
        int res2 = t.uniquePaths2(m,n);//2. Memorization.
        System.out.println("The possible ways are: "+res2);

        ////////
        int res3 = t.uniquePaths3(m,n);//3. Memorization.
        System.out.println("The possible ways are: "+res3);
    }

    // 1. Using Recursion.
    public int uniquePaths(int m, int n) {
        return uniquePathsHelper(m-1, n-1);
    }

    public int uniquePathsHelper(int m, int n) {
        if(m<0 || n<0)
            return 0;
        if(m==0 || n==0)
            return 1;
        return uniquePathsHelper(m-1, n) + uniquePathsHelper(m, n-1);
    }

    //////////////

    public int uniquePaths2(int m, int n) {
        return uniquePathsHelper2(m-1, n-1, new int[n][m]);
    }

    private int uniquePathsHelper2(int m, int n, int[][] memo) {
        if (m < 0 || n < 0) {
            return 0;
        } else if (m == 0 || n == 0) {
            return 1;
        } else if (memo[n][m] > 0) {
            return memo[n][m];
        } else {
            memo[n][m] = uniquePathsHelper2(m - 1, n, memo) + uniquePathsHelper2(m, n - 1, memo);
            return memo[n][m];
        }
    }

    //////////
    private int uniquePaths3(int m, int n){
        if(m<0||n<0) {
            return 0;
        } else if(m==1 || n==1){
            return 1;
        } else {
            int[][] dp = new int[m][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(i==0||j==0){
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    }
                }
            }
            return dp[m-1][n-1];
        }
    }

}
