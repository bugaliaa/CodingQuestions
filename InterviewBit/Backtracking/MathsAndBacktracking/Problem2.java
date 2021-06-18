package InterviewBit.Backtracking.MathsAndBacktracking;

// https://www.interviewbit.com/problems/kth-permutation-sequence/
// Kth Permutation Sequence (BIG NUMBERS ERROR)

import java.util.*;

public class Problem2 {
    public String getPermutation(int A, int B) {
        int fact = 1;
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < A; i++){
            fact = fact*i;
            list.add(i);
        }

        list.add(A);
        B--;

        String ans = "";
        
        while(true){
            ans = ans + list.get(B/fact);
            list.remove(B/fact);
            if(list.size() == 0) break;
            B = B%fact;
            fact = fact/list.size();
        }

        return ans;
    }
}
