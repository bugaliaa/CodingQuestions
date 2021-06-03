package SDE.Day25;

// https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1
// Maximum sum increasing subsequence (GFG)

public class Problem6 {
    public static void main(String[] args) {
        int arr[] = {1, 101, 2, 3, 100};
        Problem6 p = new Problem6();
        System.out.println(p.maxSumIS(arr, arr.length));
    }
    public int maxSumIS(int arr[], int n){
        int[] dp = new int[n];
        dp[0] = arr[0];
        int ans = arr[0];

        for(int i = 1; i < n; i++){
            int temp = 0;
            for(int j = 0; j < n; j++){
                if(arr[j] < arr[i]) temp = Math.max(dp[j], temp);
            }
            dp[i] = temp+arr[i];
            ans = Math.max(dp[i], ans);
        }

        return ans;
	}
}
