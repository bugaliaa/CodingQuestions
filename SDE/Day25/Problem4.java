package SDE.Day25;

// https://www.interviewbit.com/problems/0-1-knapsack/
// 0-1 KnapSack (InterviewBit)

import java.util.*;

public class Problem4 {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int n = A.size();
        int[][] dp = new int[n+1][C+1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= C; j++){
                if(j < B.get(i-1)) dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-B.get(i-1)] + A.get(i-1));
                }
            }
        }

        return dp[n][C];
    }
}
