package InterviewBit.Arrays.Sorting;

// https://www.interviewbit.com/problems/wave-array/
// Wave Array

import java.util.*;

public class Problem2 {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i = 0; i < A.size()-1; i++){
            Collections.swap(A, i, i+1);
        }
        return A;
    }
}
