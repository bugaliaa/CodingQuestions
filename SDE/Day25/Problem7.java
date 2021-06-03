package SDE.Day25;

// https://practice.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1
// Matrix Chain Multiplication (GFG)

public class Problem7 {
    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};
        int n = 5;
        System.out.println(matrixMultiplication(n, arr));
    }
    static int matrixMultiplication(int N, int arr[]){
        int[][] dp = new int[N-1][N-1];
        for(int gap = 0; gap < dp.length; gap++){
            for(int i = 0, j = gap; j < dp.length; j++, i++){
                if(gap == 0) dp[i][j] = 0;
                else if(gap == 1){
                    dp[i][j] = arr[i] * arr[j] * arr[j+1];
                }else{
                    int min = Integer.MAX_VALUE;
                    for(int k = i; k < j; k++){
                        int lc = dp[i][k];
                        int rc = dp[k+1][j];
                        int mc = arr[i]*arr[k+1]*arr[j+1];
                        int total = lc + rc + mc;
                        min = Math.min(min, total);
                    }
                    dp[i][j] = min;
                }
            }
        }

        return dp[0][N-2];
    }
}
