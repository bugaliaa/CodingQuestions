package InterviewBit.Arrays.ArrayMath;

// https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
// Max Sum Contiguous Subarray

import java.util.*;

public class Problem4 {
    public int maxSubArray(final List<Integer> A) {
        int max = A.get(0);
        int sum = 0;
        for(int i = 0; i < A.size(); i++){
            sum += A.get(i);
            max = Math.max(sum, max);
            if(sum < 0) sum = 0;
        }
        return max;
    }
}
