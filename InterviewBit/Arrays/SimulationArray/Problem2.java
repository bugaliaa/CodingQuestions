package InterviewBit.Arrays.SimulationArray;

// https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/
// Kth Row of Pascal's Triangle

import java.util.*;

public class Problem2 {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> prev = new ArrayList<>();
        for(int i = 0; i <= A; i++){
            ArrayList<Integer> curr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) curr.add(1);
                else{
                    curr.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = curr;
        }
        return prev;
    }
}
