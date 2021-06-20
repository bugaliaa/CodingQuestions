package InterviewBit.Hashing.IncrementalHash;

// https://www.interviewbit.com/problems/subarray-with-given-xor/
// Subarray with given xor

import java.util.*;

public class Problem2 {
    public int solve(ArrayList<Integer> A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        int c = 0;
        int xr = 0;

        for(int i = 0; i < A.size(); i++){
            xr = xr^A.get(i);
            if(map.get(xr^B) != null){
                c += map.get(xr^B);
            }
            if(xr == B) c++;
            if(map.get(xr) != null) map.put(xr, map.get(xr)+1);
            else map.put(xr, 1);
        }

        return c;
    }
}
