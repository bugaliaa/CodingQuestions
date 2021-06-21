package InterviewBit.Hashing.KeyFormation;

// https://www.interviewbit.com/problems/pairs-with-given-xor/
// Pairs with given xor

import java.util.*;

public class Problem1 {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < A.size(); i++){
            int curr = B^A.get(i);

            if(map.containsKey(curr)) count += map.get(curr);

            if(map.containsKey(A.get(i))) map.put(A.get(i), map.get(A.get(i))+1);
            else map.put(A.get(i), 1);

        }

        return count;
    }
}
