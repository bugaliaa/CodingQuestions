package InterviewBit.Arrays.ArrayMath;

// https://www.interviewbit.com/problems/minimum-lights-to-activate/
// Minimum Lights to activate

import java.util.*;

public class Problem2 {
    public int solve(ArrayList<Integer> A, int B) {
        int ans = 0;
        boolean flag = false;

        for(int i = 0; i < A.size(); i++){
            
            int a = Math.max(0, i-B+1);
            int b = Math.min(A.size()-1, i+B-1);
            while(b >= a){
                if(A.get(i) == 1){
                    ans++;
                    flag = true;
                    i = b + B;
                    break;
                }
                b--;
            }
            if(!flag) return -1;
            flag = false;
        }
        return ans;
    }
}
