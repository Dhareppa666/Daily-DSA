package main.finale.DSA.graphs.class03.knapsack;

// A recursive implementation of the 0 - 1 Knapsack problem
public class Zero_One_Knapsack {

    // A method that returns the maximum value that may be put in the given knapsack of
    // capacity c by applying brute force with the help of recursion
    public int maxknapSackVal(int capacity, int[] wt, int[] profits, int size) {
        if (size == 0 || capacity == 0) {
            // if no item is present or the capacity of the knapsack is 0,
            // then there is no need to go further.
            return 0;
        }
        // The capacity capacity of the knapsack is less than the lth item. Therefore,
        // it is not possible to include this item in creating the solution
        if (wt[size - 1] > capacity) {
            return maxknapSackVal(capacity, wt, profits, size - 1);
        } else {
            // recursively solving the answer
            // Case 1: include the lth item
            int val1 = maxknapSackVal(capacity - wt[size - 1], wt, profits, size - 1);
            // Case 2: exclude the lth item
            int val2 = maxknapSackVal(capacity, wt, profits, size - 1);
            // return the maximum of both
            return Math.max(profits[size - 1] + val1, val2);
        }
    }

    public static void main(String argvs[]) {
        int values[] = new int[]{100, 60, 120};
        int weight[] = new int[]{20, 10, 30};

        int C = 50; // capacity of the knapsack
        int length = values.length;

        Zero_One_Knapsack knapObj = new Zero_One_Knapsack();
        int maxVal = knapObj.maxknapSackVal(C, weight, values, length);
        System.out.println("The maximum value is: " + maxVal);

        int maxVal2 = knapObj.maxknapSackValDP(C, weight, values, length);
        System.out.println("The maximum value is: " + maxVal2);
    }

    public int maxknapSackValDP(int capacity, int[] wt, int[] profits, int size) {
        int[][] dp = new int[size + 1][capacity + 1];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (wt[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], profits[i-1] + dp[i - 1][j - wt[i-1]]);
                }
            }
        }
        return dp[size][capacity];
    }

}
