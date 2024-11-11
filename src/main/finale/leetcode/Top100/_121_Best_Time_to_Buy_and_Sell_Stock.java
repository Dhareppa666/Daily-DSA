package main.finale.leetcode.Top100;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class _121_Best_Time_to_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {
        int left = 0, right = 0, n = prices.length;
        int max = 0;
        while (right < n) {
            if (prices[left] > prices[right]) {
                left = right;
            } else {
                max = Math.max(max, prices[right] - prices[left]);
            }
            right++;
        }
        return max;
    }

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    //122. Best Time to Buy and Sell Stock II
    public int maxProfit2(int[] prices) {
        int left = 0, right = 0, n = prices.length;
        int profit = 0;
        while (right < n) {
            if (left == right) {
                right++;
                continue;
            }
            if (prices[left] < prices[right]) {
                profit += prices[right] - prices[left];
                left = right;
            } else {
                left++;
            }
            right++;
        }
        return profit;
    }

    public int maxProfit22(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
