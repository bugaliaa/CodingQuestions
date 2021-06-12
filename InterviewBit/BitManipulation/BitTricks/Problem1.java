package InterviewBit.BitManipulation.BitTricks;

// https://www.interviewbit.com/problems/min-xor-value/
// Min XOR value

import java.util.*;

public class Problem1 {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < A.size()-1; i++){
            ans = Math.min(A.get(i)^A.get(i+1), ans);
        }

        return ans;
    }
}
