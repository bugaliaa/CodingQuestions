package InterviewBit.Arrays.SpaceRecycle;

// https://www.interviewbit.com/problems/maximum-sum-square-submatrix/
// Maximum Sum Square Submatrix

import java.util.*;

public class Problem3 {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int rows = A.size();
        int cols = A.get(0).size();
        int maxSum = Integer.MIN_VALUE;

        int[][] dp = new int[rows+1][cols+1];
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                dp[i][j] = A.get(i-1).get(j-1) + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
            }
        }

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                int sum = Integer.MIN_VALUE;
                if(i-B >= 0 && j-B >= 0){
                    sum = dp[i][j] - dp[i-B][j] - dp[i][j-B] + dp[i-B][j-B];
                    maxSum = Math.max(maxSum, sum);
                } 
            }
        }

        return maxSum;
    }
}
