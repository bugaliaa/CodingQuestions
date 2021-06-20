package InterviewBit.Hashing.HashSearch;

// https://www.interviewbit.com/problems/diffk-ii/
// DiffK II

import java.util.*;

public class Problem6 {
    public int diffPossible(final List<Integer> A, int B) {
        if(A.size() < 2 || B < 0) return 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < A.size(); i++){
            int Ai = A.get(i)-B;
            int Aj = A.get(i)+B;

            if(set.contains(Ai)) return 1;
            if(set.contains(Aj)) return 1;

            set.add(A.get(i));
        }

        return 0;
    }
}
