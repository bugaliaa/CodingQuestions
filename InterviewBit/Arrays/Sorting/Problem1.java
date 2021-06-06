package InterviewBit.Arrays.Sorting;

// https://www.interviewbit.com/problems/noble-integer/
// Noble Integer

import java.util.*;

public class Problem1 {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        if(A.get(n-1) == 0) return 1;
        for(int i = 0; i < n; i++){
            int j = n - i - 1;
            if(A.get(i) != A.get(i+1)){
                if(A.get(i) == j) return 1;
            }
        }
        return -1;
    }
}
