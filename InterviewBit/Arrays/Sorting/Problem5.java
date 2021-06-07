package InterviewBit.Arrays.Sorting;

// https://www.interviewbit.com/problems/maximum-unsorted-subarray/
// Maximum Unsorted Array

import java.util.*;

public class Problem5 {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int l = 0;
        int n = A.size();
        int r = n-1;
        
        ArrayList<Integer> list = new ArrayList<>();

        for(l = 0; l < n-1; l++){
            if(A.get(l) > A.get(l+1)) break;
        }
        
        if(l == n-1){
            list.add(-1);
            return list;
        }

        for(r = n-1; r > 0; r--){
            if(A.get(r-1) > A.get(r)) break;
        }

        int max = A.get(l);
        int min = A.get(l);
        for(int i = l; i <= r; i++){
            max = Math.max(max, A.get(i));
            min = Math.min(min, A.get(i));
        }

        for(int i = 0; i < l; i++){
            if(A.get(i) > min){
                l = i;
                break;
            }
        }

        for(int i = n-1; i >= r+1; i--){
            if(A.get(i) < max){
                r = i;
                break;
            }
        }

        list.add(l);
        list.add(r);

        return list;
    }
}
