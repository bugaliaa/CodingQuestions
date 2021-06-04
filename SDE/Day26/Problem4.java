package SDE.Day26;

// https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
// Subset Sum (GFG)

public class Problem4 {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 2};
        System.out.println(isSubsetSum(11, arr));
    }
    static boolean isSubsetSum(int sum, int arr[]){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0 && j == 0) dp[i][j] = true;
                else if(i == 0) dp[i][j] = false;
                else if(j == 0) dp[i][j] = true;
                else{
                    if(dp[i-1][j]) dp[i][j] = true;
                    else if(j >= arr[i-1]) dp[i][j] = dp[i-1][j - arr[i-1]];
                }
            }
        }

        return dp[n][sum];
    }    
}
