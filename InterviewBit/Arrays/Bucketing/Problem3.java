package InterviewBit.Arrays.Bucketing;

// https://www.interviewbit.com/problems/maximum-consecutive-gap/
// Maximum Consecutive Gap

import java.util.*;

public class Problem3 {
    public int maximumGap(final List<Integer> A) {
        int n = A.size();
        if(n < 2) return 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: A) pq.add(i);

        int max = 0;

        int a = pq.poll();
        while(!pq.isEmpty()){
            int b = pq.poll();
            max = Math.max(Math.abs(a-b), max);
            a = b;
        }

        return max;
    }
}
