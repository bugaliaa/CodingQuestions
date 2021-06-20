package InterviewBit.Hashing.HashSearch;

// https://www.interviewbit.com/old/problems/valid-sudoku/
// Valid Sudoku

import java.util.*;

public class Problemr5 {
    public int isValidSudoku(final List<String> A) {
        for(int i = 0; i < A.size(); i++){
            for(int j = 0; j < A.size(); j++){
                if(!isValid(A, i, j)) return 0;
            }
        }
        return 1;
    }
    public boolean isValid(final List<String> A, int row, int col){
        return notInRow(A, row) && notInCol(A, col) && notInBox(A, row-row%3, col-col%3);
    }
    public boolean notInRow(final List<String> A, int row){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < A.size(); i++){
            if(set.contains(A.get(row).charAt(i))) return false;

            if(A.get(row).charAt(i) != '.') set.add(A.get(row).charAt(i));
        }

        return true;
    }
    public boolean notInCol(final List<String> A, int col){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < A.size(); i++){
            if(set.contains(A.get(i).charAt(col))) return false;
            if(A.get(i).charAt(col) != '.') set.add(A.get(i).charAt(col));
        }

        return true;
    }
    public boolean notInBox(final List<String> A, int rowStart, int colStart){
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                char curr = A.get(i+rowStart).charAt(j+colStart);

                if(set.contains(curr)) return false;
                if(curr != '.') set.add(curr);
            }
        }

        return true;
    }
}
