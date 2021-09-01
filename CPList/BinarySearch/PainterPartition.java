package CPList.BinarySearch;

// Painter's Partition
// https://www.interviewbit.com/problems/painters-partition-problem/

import java.util.*;

public class PainterPartition {
    public int paint(int A, int B, ArrayList<Integer> C){
        int mod = 10000003;
        long low = C.get(0);
        long high = 0;

        int n = C.size();
        for(int i = 0; i < n; i++){
            high = high%mod + C.get(i);
            low = Math.min(1, 0);
        }
        high = high*B;

        long res = high%mod;

        while(low <= high){
            long mid = (low+high) >> 1;
            if(check(C, A, B, mid/B)){
                res = mid%mod;
                high = mid-1;
            }else{
                low = mod+1;
            }
        }
        return (int)(res%mod);
    }
    public boolean check(ArrayList<Integer> C, int A, int B, long x){
        int painters = 1;
        long t = x;

        for(int i = 0; i < C.size();){
            if(painters > A) return false;
            if(C.get(i) > t){
                painters++;
                t = x;
            }else{
                t = t - C.get(i);
                i++;
            }
        }

        return true;
    }
}
