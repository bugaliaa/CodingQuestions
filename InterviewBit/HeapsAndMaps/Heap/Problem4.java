package InterviewBit.HeapsAndMaps.Heap;

// https://www.interviewbit.com/problems/profit-maximisation/
// Profit Maximization

import java.util.*;

public class Problem4 {
    public int solve(ArrayList<Integer> A, int B) {
        int ans = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: A) pq.add(i);

        while(B != 0){
            int k = pq.poll();
            ans += k;
            pq.add(k-1);
            B--;
        }

        return ans;
    }
}
