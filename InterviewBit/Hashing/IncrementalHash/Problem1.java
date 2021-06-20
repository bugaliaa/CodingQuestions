package InterviewBit.Hashing.IncrementalHash;

// https://www.interviewbit.com/problems/an-increment-problem/
// An Increment Problem

import java.util.*;

public class Problem1 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < A.size(); i++){
            if(map.containsKey(A.get(i))){
                int idx = map.get(A.get(i));
                A.set(idx, A.get(idx)+1);
                map.replace(A.get(idx), idx);
            }
            map.replace(A.get(i), i); 
        }
        return A;
    }
}
