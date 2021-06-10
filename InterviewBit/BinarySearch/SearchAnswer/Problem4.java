package InterviewBit.BinarySearch.SearchAnswer;

// https://www.interviewbit.com/problems/painters-partition-problem/
// Painter's Partition Problem

import java.util.*;

public class Problem4 {
    public int paint(int A, int B, ArrayList<Integer> C) {
        long low = C.get(0);
        long mod = 10000003;
        long high = 0;
        for(int i: C){
            high = high%mod + i%mod;
            low = Math.max(low, i);
        }
        high = high*B;

        long res = high%mod;

        while(low <= high){
            long mid = (low+high) >> 1;
            if(isFeasible(C, A, B, mid/B)){
                res = mid%mod;
                high = mid-1;
            }else low = mid+1;
        }

        return (int)(res%mod);
    }
    public boolean isFeasible(ArrayList<Integer> C, int A, int B, long X){
        int painters = 1;
        long t = X;

        for(int i = 0; i < C.size();){
            if(painters > A) return false;
            if(C.get(i) > t){
                painters++;
                t = X;
            }else{
                t = t - C.get(i);
                i++;
            }
        }

        return true;
    }
}
