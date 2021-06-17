package InterviewBit.StackAndQueues.Queue;

// https://www.interviewbit.com/problems/sliding-window-maximum/
// Sliding Window Maximum

import java.util.*;

public class Problem2 {
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        if(A.size() == 1 && B == 1) return new ArrayList<>(A);
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        for(; i < B; i++){
            while(!dq.isEmpty() && A.get(dq.peekLast()) <= A.get(i)) dq.removeLast();
            dq.addLast(i);
        }

        for(; i < A.size(); i++){
            list.add(A.get(dq.peekFirst()));
            while(!dq.isEmpty() && dq.peekFirst() <= i-B) dq.removeFirst();
            while(!dq.isEmpty() && A.get(dq.peekLast()) <= A.get(i)) dq.removeLast();
            dq.addLast(i);
        }
        list.add(A.get(dq.peekFirst()));
        return list;
    }
}
