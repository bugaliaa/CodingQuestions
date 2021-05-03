package SDE.Day8;

import java.util.*;

// https://www.geeksforgeeks.org/greedy-algorithm-to-find-minimum-number-of-coins/
// Minimum Number of Coins (GFG)

public class Problem5 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        long amount = 1221;
        System.out.println(minNumberOfCoins(amount, coins));
    }

    public static int minNumberOfCoins(long amount, int[] coins){
        Arrays.sort(coins);
        int ans = 0;
        for(int i = coins.length-1; i >= 0; i--){
            if(coins[i] <= amount){
                ans += amount / coins[i];
                amount = amount%coins[i];
            }
        }
        return ans;
    }
}
