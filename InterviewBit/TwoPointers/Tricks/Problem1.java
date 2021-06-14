package InterviewBit.TwoPointers.Tricks;

// https://www.interviewbit.com/problems/maximum-ones-after-modification/
// Maximum Ones after Modification

import java.util.*;

public class Problem1 {
    public int solve(ArrayList<Integer> A, int B) {
        int c = 0;
        int l = 0;

        int max = 0;
        for(int i = 0; i < A.size(); i++){
            if(A.get(i) == 0) c++;

            while(c > B){
                if(A.get(i) == 0) c--;
                l++;
            }
            max = Math.max(max, i - l + 1);
        }

        return max;
    }
}
