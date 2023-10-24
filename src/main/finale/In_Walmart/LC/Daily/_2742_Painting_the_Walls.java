package main.finale.In_Walmart.LC.Daily;

//Input: cost = [1,2,3,2], time = [1,2,3,2]
//Output: 3
public class _2742_Painting_the_Walls {

    public static void main(String[] args) {
        int[] cost = {1, 2, 3, 2};
        int[] time = {1, 2, 3, 2};
        int timeTaken = paintWalls(cost, time);
        System.out.println(timeTaken);
    }

    public static int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        return (int) paintWallsHelper(cost, time, 0, 0, new Long[n][501]);
    }

    private static long paintWallsHelper(int[] cost, int[] time, int index, int total, Long[][] memo) {
        if (total >= cost.length)
            return 0;
        if (index >= cost.length)
            return Integer.MAX_VALUE;
        if (memo[index][total] != null)
            return memo[index][total];

        long with = cost[index] + paintWallsHelper(cost, time, index + 1, total + time[index] + 1, memo);
        long without = paintWallsHelper(cost, time, index + 1, total, memo);
        return memo[index][total] = Math.min(with, without);
    }
}
