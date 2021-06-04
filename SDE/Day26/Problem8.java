package SDE.Day26;

// https://leetcode.com/problems/palindrome-partitioning-ii/
// Palindrome Partiotioning II (LeetCode)

public class Problem8 {
    public static void main(String[] args) {
        Problem8 p = new Problem8();
        String s = "aab";
        System.out.println(p.minCut(s));
    }
    public int minCut(String s) {
        int n = s.length();
        boolean[][] dp1 = new boolean[n][n];

        for(int g = 0; g < n; g++){
            for(int i = 0, j = g; j < n; i++, j++){
                if(g == 0) dp1[i][j] = true;
                else if(g == 1) dp1[i][j] = s.charAt(i) == s.charAt(j);
                else dp1[i][j] = s.charAt(i) == s.charAt(j) && dp1[i+1][j-1];
            }
        }
        
        int dp[] = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0) dp[i] = 0;
            else if(i == 1) dp[i] = s.charAt(0) == s.charAt(i) ? 0 : 1;
            else{
                if(dp1[0][i]) dp[i] = 0;
                else {
                    int min = Integer.MAX_VALUE;
                    for(int j = i; j > 0; j--){
                        if(dp1[j][i]){
                            min = Math.min(min, dp[j-1]);
                        }
                    }
                    dp[i] = min+1;
                }                
            }
        }

        return dp[n-1];
    }
}
