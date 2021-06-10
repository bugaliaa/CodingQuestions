package InterviewBit.BinarySearch.SearchAnswer;

// https://www.interviewbit.com/problems/allocate-books/
// Allocate Books

import java.util.*;

public class Problem3 {
    public int books(ArrayList<Integer> A, int B) {
        if(B > A.size()) return -1;
        int low = A.get(0);
        int high = 0;
        for(int i: A){
            high += i;
            low = Math.min(low, i);
        }

        int res = -1;

        while(low <= high){
            int mid = (low+high) >> 1;
            if(allocationPossible(mid, A, B)){
                res = mid;
                high = mid-1;
            }else low = mid+1;
        }

        return res;
    }

    public boolean allocationPossible(int pages, ArrayList<Integer> A, int students){
        int cnt = 0;
        int sumAllocation = 0;
        
        for(int i = 0; i < A.size(); i++){
            if(sumAllocation + A.get(i) > pages){
                cnt++;
                sumAllocation = A.get(i);
                if(sumAllocation > pages) return false;
            }else{
                sumAllocation += A.get(i);
            }
        }

        if(cnt < students) return true;

        return false;
    }
}
