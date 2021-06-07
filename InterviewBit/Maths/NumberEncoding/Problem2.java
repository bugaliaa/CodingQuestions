package InterviewBit.Maths.NumberEncoding;

// https://www.interviewbit.com/problems/rearrange-array/
// Rearrange Array

import java.util.*;

public class Problem2 {
    public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for(int i = 0; i < n; i++){
            a.set(i, a.get(i) + (a.get((int)a.get(i))%n)*n);
        }
        for(int i = 0; i < n; i++){
            a.set(i, a.get(i)/n);
        }
    }
}
