package InterviewBit.BinarySearch.SearchAnswer;

// https://www.interviewbit.com/problems/matrix-median/
// Matrix Median

import java.util.*;

public class Problem1 {
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int r = A.size();
        int c = A.get(0).size();

        int low = Integer.MIN_VALUE;
        int high = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low+high) >> 1;
            int count = 0;
            
            for(int i = 0; i < r; i++){
                count += countSmaller(A.get(i), mid);
            }

            if(count <= (r*c)/2) low = mid+1;
            else high = mid-1;
        }

        return low;
    }
    public int countSmaller(ArrayList<Integer> row, int mid){
        int l = 0;
        int h = row.size()-1;
        while(l <= h){
            int md = (l+h) >> 1;
            if(row.get(md) <= mid) l = md+1;
            else h = md-1;
        }
        return l;
    }
}
