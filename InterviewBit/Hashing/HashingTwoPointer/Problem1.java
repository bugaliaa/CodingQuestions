package InterviewBit.Hashing.HashingTwoPointer;

// https://www.interviewbit.com/problems/subarray-with-b-odd-numbers/
// Subarray with B Odd Numbers

import java.util.*;

public class Problem1 {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();

        int count = 0;
        int pre[] = new int[n+1];
        int odd = 0;

        for(int i = 0; i < n; i++){
            pre[odd]++;

            if((A.get(i) & 1) == 1) odd++;

            if(odd >= B) count += pre[odd-B];
        }

        return count;
    }
}
