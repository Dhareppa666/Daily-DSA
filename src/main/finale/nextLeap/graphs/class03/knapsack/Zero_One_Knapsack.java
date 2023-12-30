package main.finale.nextLeap.graphs.class03.knapsack;

// A recursive implementation of the 0 - 1 Knapsack problem
public class Zero_One_Knapsack {

    // A method that returns the maximum value that may be put in the given knapsack of
    // capacity c by applying brute force with the help of recursion
    public int maxknapSackVal(int C, int[] wt, int[] v, int l) {
        if (l == 0 || C == 0) {
            // if no item is present or the capacity of the knapsack is 0,
            // then there is no need to go further.
            return 0;
        }
        // The capacity C of the knapsack is less than the lth item. Therefore,
        // it is not possible to include this item in creating the solution
        if (wt[l - 1] > C) {
            return maxknapSackVal(C, wt, v, l - 1);
        } else {
            // recursively solving the answer
            // Case 1: include the lth item
            int val1 = maxknapSackVal(C - wt[l - 1], wt, v, l - 1);
            // Case 2: exclude the lth item
            int val2 = maxknapSackVal(C, wt, v, l - 1);
            // return the maximum of both
            return Math.max(v[l - 1] + val1, val2);
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
    }
}
