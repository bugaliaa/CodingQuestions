package InterviewBit.StackAndQueues.Cleverstack;

// https://www.interviewbit.com/problems/nearest-smaller-element/
// Nearest Smaller Element

import java.util.*;

public class Problem2 {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        s.add(A.get(0));
        list.add(-1);

        for(int i = 1; i < A.size(); i++){
            while(!s.isEmpty() && A.get(i) < s.peek()) s.pop();
            list.add(s.isEmpty() ? -1 : s.peek());
            s.push(A.get(i));
        }

        return list;
    }
}
