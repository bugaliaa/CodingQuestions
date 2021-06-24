package InterviewBit.HeapsAndMaps.Heap;

// https://www.interviewbit.com/problems/k-largest-elements/
// K Largest Elements

import java.util.*;

public class Problem3 {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int i: A){
            if(pq.size() < k) pq.add(i);
            else if(pq.peek() < i){
                pq.poll();
                pq.add(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i: pq) ans.add(i);

        return ans;
    }
}
