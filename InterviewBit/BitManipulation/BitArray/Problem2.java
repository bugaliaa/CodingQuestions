package InterviewBit.BitManipulation.BitArray;

// https://www.interviewbit.com/problems/single-number-ii/
// Single Number II

import java.util.*;

public class Problem2 {
    public int singleNumber(final List<Integer> A) {
        int count[] = new int[32];

        for(int i = 0; i < 32; i++){
            for(int j = 0; j < A.size(); j++){
                if((A.get(j) & 1 << i) != 0) count[i]++;
            }
        }

        int res = 0;
        for(int i = 0; i < 32; i++){
            res += (count[i]%3)*(1 << i);
        }

        return res;
    }
}
