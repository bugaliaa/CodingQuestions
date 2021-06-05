package InterviewBit.Arrays.ArrayMath;

// https://www.interviewbit.com/problems/maximum-sum-triplet/
// Maximum Sum Triplet

import java.util.*;

public class Problem3 {
    public int solve(ArrayList<Integer> A) {
        int ans = Integer.MIN_VALUE;
        int n = A.size();
        for(int i = 1; i < n-1; i++){
            int max1 = 0;
            int max2 = 0;

            for(int j = 0; j < i; j++){
                if(A.get(j) < A.get(i)) max1 = Math.max(A.get(j), max1);
            }

            for(int j = i+1; j < n; j++){
                if(A.get(j) > A.get(i)) max2 = Math.max(A.get(j), max2);
            }

            if(max1 > 0 && max2 > 0) ans = Math.max(ans, A.get(i) + max1 + max2);
        }

        return ans;
    }
}
