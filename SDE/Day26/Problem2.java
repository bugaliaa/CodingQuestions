package SDE.Day26;

// https://leetcode.com/problems/minimum-path-sum
// Minimum Path Sum (LeetCode)

public class Problem2 {
    public static void main(String[] args) {
        Problem2 p = new Problem2();
        int[][] grid = {{1,2}, {1, 1}};
        System.out.println(p.minPathSum(grid));
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        
        for(int i = 1; i < m; i++) dp[0][i] = grid[0][i] + dp[0][i-1];
        for(int i = 1; i < n; i++) dp[i][0] = grid[i][0] + dp[i-1][0];
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        
        return dp[n-1][m-1];
    }
}
