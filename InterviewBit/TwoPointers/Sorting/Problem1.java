package InterviewBit.TwoPointers.Sorting;

// https://www.interviewbit.com/problems/pair-with-given-difference/
// Pair with given difference

import java.util.*;

public class Problem1 {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int i = 0;
        int j = 1;

        while(i < A.size() && j < A.size()){
            int diff = A.get(j) - A.get(i);
            if(diff == B && i != j) return 1;
            else if(diff < B) j++; 
            else i++;
        }

        return 0;
    }
}
