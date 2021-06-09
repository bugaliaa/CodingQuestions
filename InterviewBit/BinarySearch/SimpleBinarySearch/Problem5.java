package InterviewBit.BinarySearch.SimpleBinarySearch;

// https://www.interviewbit.com/problems/sorted-insert-position/
// Sorted Insertion Position

import java.util.*;

public class Problem5 {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int n = a.size();

        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(a.get(mid) == b) return mid;
            else if(a.get(mid) > b) high = mid-1;
            else low = mid+1;
        }

        return low;
    }    
}
