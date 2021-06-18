package InterviewBit.Backtracking.GamesSolving;

// https://www.interviewbit.com/problems/nqueens/
// N Queens

import java.util.*;

public class Problem1 {
    public ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) board[i][j] = '.';
        helper(board, 0, n, ans);
        return ans;
    }
    public void helper(char[][] board, int row, int n, ArrayList<ArrayList<String>> ans){
        if(n == row){
            ans.add(construct(board));
            return;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                helper(board, row+1, n, ans);
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col, int n){
        for(int i = 0; i != row; i++) if(board[i][col] == 'Q') return false;
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) if(board[i][j] == 'Q') return false;
        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++) if(board[i][j] == 'Q') return false;

        return true;
    }
    public ArrayList<String> construct(char[][] board){
        ArrayList<String> path = new ArrayList<>();
        for(int i = 0; i < board.length; i++) path.add(new String(board[i]));
        return path;
    }
}
