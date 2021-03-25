package SDE.Day2;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock
// Stock Buy and Sell

public class Problem5 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                profit = Math.max(profit, prices[i]-min);
            }
        }
        return profit;
    }
}
