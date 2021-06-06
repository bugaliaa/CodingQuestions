package InterviewBit.Arrays.SpaceRecycle;

// https://www.interviewbit.com/problems/first-missing-integer/
// First Missing Integer

import java.util.*;

public class Problem2 {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int n = A.size();

        for(int i = 0; i < n; i++){
            if(A.get(i) < 1) A.set(i, n+1);
        }

        for(int i = 0; i < n; i++){
            if(Math.abs(A.get(i)) <= n){
                int x = Math.abs(A.get(i));
                A.set(x-1, -A.get(x-1));
            }
        }

        for(int i = 0; i < n; i++){
            if(A.get(i) > 0) return i+1;
        }

        return n+1;
    }
}
