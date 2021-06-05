package InterviewBit.Arrays.ArrayMath;

// https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
// Min Steps in Infinite grid

import java.util.*;

public class Problem1 {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int c = 0;
        for(int i = 0; i < A.size()-1; i++){
            int p = Math.abs(B.get(i)-B.get(i+1));
            int q = Math.abs(A.get(i)-A.get(i+1));

            c += Math.max(p, q);
        }
        return c;
    }
}
