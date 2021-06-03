package SDE.Day26;

import java.util.Arrays;

// https://leetcode.com/problems/coin-change/
// Coin Change (LeetCode)

public class Problem3 {
    public static void main(String[] args) {
        Problem3 p = new Problem3();
        int coins[] = {1,2,5};
        int amount = 11;
        System.out.println(p.coinChange(coins, amount));
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Arrays.sort(coins);
        int dp[] = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < n; j++){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
                }else break;
            }
        }
        return dp[amount] == amount+1 ? -1 : dp[amount]; 
    }
}
