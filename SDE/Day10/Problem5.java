package SDE.Day10;

// https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
// Rat in a maze (GFG)

import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        int m[][] = {{1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}};
        ArrayList<String> list = findPath(m, m.length);
        for(String s: list) System.out.println(s + " ");
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(m, n, 0, 0, new boolean[n][n], ans, "");
        return ans;
    }
    public static void helper(int[][] m, int n, int row, int col, boolean[][] visited, ArrayList<String> ans, String s){
        if(row == -1 || col == -1 || row == n || col == n || visited[row][col] || m[row][col] == 0) return;

        if(row == n-1 && col == n-1){
            ans.add(s);
            return;
        }

        visited[row][col] = true;
        if(isSafe(m, n, visited, row+1, col)){
            s += 'D';
            helper(m, n, row+1, col, visited, ans, s);
            s = s.substring(0, s.length()-1);
        }
        if(isSafe(m, n, visited, row, col+1)){
            s += 'R';
            helper(m, n, row, col+1, visited, ans, s);
            s = s.substring(0, s.length()-1);
        }
        if(isSafe(m, n, visited, row-1, col)){
            s += 'U';
            helper(m, n, row-1, col, visited, ans, s);
            s = s.substring(0, s.length()-1);
        }
        if(isSafe(m, n, visited, row, col-1)){
            s += 'L';
            helper(m, n, row, col-1, visited, ans, s);
            s = s.substring(0, s.length()-1);
        }
        visited[row][col] = false;
    }
    public static boolean isSafe(int[][] m, int n, boolean[][] visited, int row, int col){
        if(row == -1 || col == -1 || row == n || col == n || visited[row][col] || m[row][col] == 0) return false;

        return true;
    }
}
