package InterviewBit.DynamicProgramming.TwoDStringDP;

// https://www.interviewbit.com/problems/edit-distance/
// Edit Distance

public class Problem3 {
    public int minDistance(String A, String B) {
        int n = A.length();
        int m = B.length();

        int[][] dp = new int[n+1][m+1];

        for(int i = 1; i <= n; i++) dp[i][0] = i;
        for(int i = 1; i <= m; i++) dp[0][i] = i;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(A.charAt(i-1) == B.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]))+1;
            }
        }

        return dp[n][m];
    }
}
