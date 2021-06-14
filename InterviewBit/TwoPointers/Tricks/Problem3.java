package InterviewBit.TwoPointers.Tricks;

// https://www.interviewbit.com/problems/array-3-pointers/
// Array 3 Pointers

import java.util.*;

public class Problem3 {
    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int ans = Integer.MAX_VALUE;

        int i = 0, j = 0, k = 0;

        while(i < A.size() && j < B.size() && k < C.size()){
            int a = A.get(i);
            int b = B.get(j);
            int c = C.get(k);

            int currMax = Math.max(Math.abs(a - b), Math.max(Math.abs(a - c), Math.abs(b - c)));
            ans = Math.min(ans, currMax);

            if(a <= b && a <= c) i++;
            else if(b <= a && b <= c) j++;
            else k++;
        }

        return ans;

    }
}
