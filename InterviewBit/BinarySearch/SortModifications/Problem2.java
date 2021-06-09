package InterviewBit.BinarySearch.SortModifications;

// https://www.interviewbit.com/problems/rotated-sorted-array-search/
// Rotated Sorted Array Search

import java.util.*;

public class Problem2 {
    public int search(final List<Integer> A, int B) {
        int low = 0;
        int high = A.size()-1;

        while(low <= high){
            if(A.get(high) == B) return high;
            else if(A.get(low) == B) return low;
            low++;
            high--;
        }
        return -1;
    }
}
