package InterviewBit.Backtracking.GamesSolving;

// https://www.interviewbit.com/problems/sudoku/
// Sudoku

import java.util.*;

public class Problem2 {
    public void solveSudoku(ArrayList<ArrayList<Character>> a) {
        helper(a);
    }
    public boolean helper(ArrayList<ArrayList<Character>> a){
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < a.size(); j++){
                if(a.get(i).get(j) == '.'){
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
            if(isSafe(a, row, col, c)){
                a.get(row).set(col, c);
                if(helper(a)) return true;
                a.get(row).set(col, '.');
            }
        }

        return false;
    }

    public boolean isSafe(ArrayList<ArrayList<Character>> a, int row, int col, char c){
        for(int i = 0; i < a.size(); i++) if(a.get(i).get(col) == c) return false;
        for(int i = 0; i < a.size(); i++) if(a.get(row).get(i) == c) return false;

        int sqrt = (int)Math.sqrt(a.size());
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;

        for(int i = rowStart; i < rowStart+sqrt; i++){
            for(int j = colStart; j < colStart+sqrt; j++){
                if(a.get(i).get(j) == c) return false;
            }
        }

        return true;
    }
}
