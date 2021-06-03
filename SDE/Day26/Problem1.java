package SDE.Day26;

// https://www.geeksforgeeks.org/maximum-path-sum-matrix/
// Maximum Path Sum Matrix (GFG)

public class Problem1 {
    public static void main(String[] args) {
        int mat[][] = { { 10, 10, 2, 0, 20, 4 }, { 1, 0, 0, 30, 2, 5 }, { 0, 10, 4, 0, 2, 0 }, { 1, 0, 2, 20, 0, 4 }};

        System.out.println(maxPathSumMatrix(mat));
    }
    public static int maxPathSumMatrix(int a[][]){
        int n = a.length;
        int m = a[0].length;

        int res = -1;
        for(int i = 0; i < m; i++) res = Math.max(res, a[0][i]);

        for(int i = 1; i < n; i++){
            res = -1;
            for(int j = 0; j < m; j++){
                if(j > 0 && j < m-1){
                    a[i][j] += Math.max(a[i-1][j], Math.max(a[i-1][j-1], a[i-1][j+1]));
                }else if(j > 0){
                    a[i][j] += Math.max(a[i-1][j], a[i-1][j-1]);
                }else if(j < m-1){
                    a[i][j] += Math.max(a[i-1][j], a[i-1][j+1]);
                }
                res = Math.max(res, a[i][j]);
            }
        }
        return res;
    }
}
