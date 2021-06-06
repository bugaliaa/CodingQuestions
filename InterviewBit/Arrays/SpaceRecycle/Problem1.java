package InterviewBit.Arrays.SpaceRecycle;

// https://www.interviewbit.com/problems/set-matrix-zeros/
// Set Matrix Zeroes

import java.util.*;

public class Problem1 {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int cols = a.get(0).size();
        int rows = a.size();
        boolean col = true;

        for(int i = 0; i < rows; i++){
            if(a.get(i).get(0) == 0) col = false;
            for(int j = 1; j < cols; j++){
                if(a.get(i).get(j) == 0){
                    a.get(i).set(0, 0);
                    a.get(0).set(j, 0);
                }
            }
        }

        for(int i = rows-1; i >= 0; i--){
            for(int j = cols-1; j >= 1; j--){
                if(a.get(i).get(0) == 0 || a.get(0).get(j) == 0) a.get(i).set(j, 0);
            }
            if(!col) a.get(i).set(0, 0);
        }
    }
}
