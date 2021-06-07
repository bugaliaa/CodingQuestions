package InterviewBit.Arrays.ArrayMath;

// https://www.interviewbit.com/problems/partitions/
// Partitions

import java.util.*;

public class Problem7 {
    public int solve(int A, ArrayList<Integer> B) {
        long pre = 0;
        for(int i: B){
            pre += i;
        }
        if(pre%3 != 0) return 0;

        long[] index = new long[A+1];
        long sf = 0;

        for(int i = A-1; i >= 0; i--){
            sf += B.get(i);
            if(sf == pre/3) index[i] = 1;
        }

        for(int i = 1; i < A; i++){
            index[i] += index[i-1];
        }
        pre = pre/3;
        long t = 0;
        int ans = 0;
        for(int i = 0; i < A-1; i++){
            t += B.get(i);
            if(t == pre) ans += index[A-1] - index[i+1];
        }

        return ans;
    }
}
