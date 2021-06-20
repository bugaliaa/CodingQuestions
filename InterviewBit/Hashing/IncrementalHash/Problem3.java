package InterviewBit.Hashing.IncrementalHash;

// https://www.interviewbit.com/problems/two-out-of-three/
// Two out of three

import java.util.*;

public class Problem3 {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int[] h1 = new int[100003];
        int[] h2 = new int[100003];
        int[] h3 = new int[100003];

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < A.size(); i++){
            h1[A.get(i)]++;
        }
        for(int i = 0; i < B.size(); i++){
            h2[B.get(i)]++;
        }
        for(int i = 0; i < C.size(); i++){
            h3[C.get(i)]++;
        }

        for(int i = 0; i < 100003; i++){
            if((h1[i] > 0 && h2[i] > 0) || (h1[i] > 0 && h3[i] > 0) || h2[i] > 0 && h3[i] > 0) list.add(i);
        }

        return list;
    }
}
