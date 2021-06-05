package InterviewBit.Arrays.Additional;

// https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/
// Max Min

import java.util.*;

public class Problem5 {
    public int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: A){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return max + min;
    }
}
