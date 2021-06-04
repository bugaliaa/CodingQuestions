package SDE.Day26;

// https://practice.geeksforgeeks.org/problems/egg-dropping-puzzle-1587115620/1
// Egg Dropping (GFG)

public class Problem6 {
    public static void main(String[] args) {
        System.out.println(eggDrop(3, 7));
    }
    static int eggDrop(int n, int k) {
        int[][] dp = new int[n+1][k+1];
        
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= k; j++){
                if(j == 0) dp[i][j] = 0;
                else if(j == 1) dp[i][j] = 1;
                else if(i == 1) dp[i][j] = j;
                else{
                    int l = 0;
                    int r = j-1;
                    int min = Integer.MAX_VALUE;
                    while(l < j && r >= 0){
                        int max = Math.max(dp[i-1][l], dp[i][r]);
                        min = Math.min(max, min);
                        l++;
                        r--;
                    }
                    dp[i][j] = min + 1;
                }
            }
        }

        return dp[n][k];
    }
}
