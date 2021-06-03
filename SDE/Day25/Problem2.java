package SDE.Day25;

// https://leetcode.com/problems/longest-increasing-subsequence/
// Longest Increasing Subsequence (LeetCode)

public class Problem2 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n];
        dp[0] = 1;

        for(int i = 1; i < n; i++){
            int max = 1;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max+1;
        }

        int ans = 1;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
}
