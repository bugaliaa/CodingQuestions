package InterviewBit.BitManipulation.BitArray;

// https://www.interviewbit.com/problems/single-number/
// Single Number

import java.util.*;

public class Problem1 {
    public int singleNumber(final List<Integer> A) {
        if(A.size() == 0) return 0;
        int x = 0;
        for(int i: A) x ^= i;
        return x;
    }
}