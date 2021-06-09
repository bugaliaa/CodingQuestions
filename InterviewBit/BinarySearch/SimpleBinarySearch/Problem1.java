package InterviewBit.BinarySearch.SimpleBinarySearch;

// https://www.interviewbit.com/problems/smaller-or-equal-elements/
// Smaller Or Equal Elements

import java.util.*;

public class Problem1 {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();

        if(A.get(0) > B) return 0;
        
        int idx = Collections.binarySearch(A, B);
        if(idx < 0){
            idx = (-1)*(idx+1);
        }

        while(idx < n && A.get(idx) == B) idx++;

        return idx;
    }
}
