package org.In_Walmart.nextLeap.arrays;

public class Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
        int res = maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {
        int min_stock = Integer.MAX_VALUE, max_profit=0;
        for(int i=0; i<prices.length; i++){
            min_stock = Math.min(min_stock, prices[i]);
            max_profit = Math.max(max_profit, prices[i]-min_stock);
        }
        return max_profit;
    }
}
