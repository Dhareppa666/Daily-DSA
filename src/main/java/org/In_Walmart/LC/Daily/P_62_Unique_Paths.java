package org.In_Walmart.LC.Daily;

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
        int res = t.uniquePaths(3,7); //1. Recursion
        System.out.println("The possible ways are: "+res);

        ////////
        int res2 = t.uniquePaths2(3,7);//2. Memorization.
        System.out.println("The possible ways are: "+res2);
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


}
