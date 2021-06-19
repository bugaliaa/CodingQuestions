package InterviewBit.Hashing.HashSearch;

// https://www.interviewbit.com/old/problems/colorful-number/
// Colorful Number

import java.util.*;

public class Problem1 {
    public int colorful(int A) {
        if(A == 0) return 1;
        Set<Integer> set = new HashSet<>();

        while(A > 0){
            int product = A%10;
            int curr = A;
            while(curr > 0){
                if(!set.add(product)) return 0;
                curr = curr/10;
                product *= curr%10;
            }
            A /= 10;
        }

        return 1;
    }
}
