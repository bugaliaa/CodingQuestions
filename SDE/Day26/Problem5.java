package SDE.Day26;

// https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
// Rod Cutting (GFG)

public class Problem5 {
    public static void main(String[] args) {
        int cuts[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;
        Problem5 p = new Problem5();
        System.out.println(p.minCost(n, cuts));
    }
    public int minCost(int n, int[] price) {
        int[] dp = new int[n+1];
        int[] a = new int[price.length+1];
        
        for(int i = 1; i < price.length; i++){
            a[i] = price[i-1];
        }

        dp[0] = 0;
        dp[1] = a[1];

        for(int i = 2; i < dp.length; i++){
            dp[i] = a[i];

            int li = 1;
            int ri = i-1;
            while(li <= ri){
                dp[i] = Math.max(dp[i], dp[li] + dp[ri]);
                li++;
                ri--;
            }
        }

        return dp[n];
    }
}
