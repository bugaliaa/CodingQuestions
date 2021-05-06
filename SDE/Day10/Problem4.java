package SDE.Day10;

// https://leetcode.com/problems/sudoku-solver/
// Sudoku Solver (LeetCode)

public class Problem4 {
    public static void main(String[] args) {
        
    }
    public static void solveSudoku(char[][] board) {
        helper(board);
    }
    public static boolean helper(char[][] board){
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '.'){
                    row = i;
                    col = j;

                    isEmpty = false;
                    break;
                }
            }
            if(!isEmpty) break;
        }

        if(isEmpty) return true;

        for(char c = '1'; c <= '9'; c++){
            if(isSafe(board, row, col, c)){
                board[row][col] = c;
                if(helper(board)) return true;
                board[row][col] = '.';
            }
        }

        return false;
    }
    public static boolean isSafe(char[][] board, int row, int col, char c){
        for (int d = 0; d < board.length; d++){
            if (board[row][d] == c) {
                return false;
            }
        }
 
        for (int r = 0; r < board.length; r++){
            if (board[r][col] == c){
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for(int r = rowStart; r < rowStart+sqrt; r++){
            for(int d = colStart; d < colStart+sqrt; d++){
                if(board[r][d] == c) return false;
            }
        }

        return true;
    }
}
