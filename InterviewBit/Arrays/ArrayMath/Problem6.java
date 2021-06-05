package InterviewBit.Arrays.ArrayMath;

// https://www.interviewbit.com/problems/maximum-absolute-difference/
// Maximum Absolute Difference

import java.util.*;

public class Problem6 {
    public int maxArr(ArrayList<Integer> A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i < A.size(); i++){
            max1 = Math.max(A.get(i)+i, max1);
            max2 = Math.max(A.get(i)-i, max2);
            min1 = Math.min(A.get(i)+i, min1);
            min2 = Math.min(A.get(i)-i, min2);
        }

        return Math.max(max1 - min1, max2 - min2);
    }
}
