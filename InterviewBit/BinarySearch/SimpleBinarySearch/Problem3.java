package InterviewBit.BinarySearch.SimpleBinarySearch;

// https://www.interviewbit.com/problems/matrix-search/
// Matrix Search

import java.util.*;

public class Problem3 {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        int i = 0;
        int j = A.get(0).size()-1;

        while(i < A.size() && j >= 0){
            if(A.get(i).get(j) == B) return 1;
            else if(A.get(i).get(j) > B) j--;
            else i++;
        }

        return 0;
    }
}
