package SDE.Day3;

//https://leetcode.com/problems/unique-paths/
// Unique Paths without DP

public class Problem6 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
    public static int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int r = m - 1;
        double res = 1;
        for(int i = 1; i <= r; i++){
            res = res * (N - r + i)/i;
        }
        return (int)res;
    }
}
