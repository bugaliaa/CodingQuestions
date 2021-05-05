package SDE.Day10;

import java.util.*;

// https://leetcode.com/problems/n-queens/
// N-Queens (LeetCode)

public class Problem3 {
    public static void main(String[] args) {
        List<List<String>> list = solveNQueens(4);
        for(List<String> s: list){
            for(String t: s) System.out.print(t + " ");
            System.out.println();
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        char[][] chess = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) chess[i][j] = '.';
        }
        List<List<String>> ans = new ArrayList<>();
        helper(chess, 0, n, ans);
        return ans;
    }
    public static void helper(char[][] chess, int row, int n, List<List<String>> ans){
        if(n == row){
            ans.add(construct(chess));
            return;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(chess, row, col, n)){
                chess[row][col] = 'Q';
                helper(chess, row+1, n, ans);
                chess[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] chess, int row, int col, int n){
        for(int i = 0; i != row; i++) if(chess[i][col] == 'Q') return false;
        for(int i = row - 1, j = col-1; i >= 0 && j >= 0; j--, i--) if(chess[i][j] == 'Q') return false;
        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++) if(chess[i][j] == 'Q') return false;

        return true;
    }
    public static List<String> construct(char[][] chess){
        List<String> path = new ArrayList<>();
        for(int i = 0; i < chess.length; i++){
            path.add(new String(chess[i]));
        }
        return path;
    }
}
