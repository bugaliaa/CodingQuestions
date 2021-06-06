package InterviewBit.Arrays.Bucketing;

// https://www.interviewbit.com/problems/find-duplicate-in-array/
// Find Duplicates in Array

import java.util.*;

public class Problem2 {
    public int repeatedNumber(final List<Integer> A) {
        int hare = A.get(0);
        int tor = A.get(0);

        do{
            hare = A.get(A.get(hare));
            tor = A.get(tor);
        }while(hare != tor);

        hare = A.get(0);
        while(tor != hare){
            tor = A.get(tor);
            hare = A.get(hare);
        }
        return tor;
    }
}
