package main.finale.DSA.dp;

public class Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
        int res = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {
        // Your code goes here
        int minStock = prices[0], res = 0;
        for (int i = 1; i < prices.length; i++) {
            res = Math.max(prices[i] - minStock, res);
            minStock = Math.min(minStock, prices[i]);
        }
        return res;
    }

}
