package InterviewBit.StackAndQueues.Queue;

// https://www.interviewbit.com/problems/largest-rectangle-in-histogram/
// Largest Rectangle in Histogram

import java.util.*;

public class Problem3 {
    public int largestRectangleArea(ArrayList<Integer> A) {
        int lb[] = nextSmallerLeft(A);
        int rb[] = nextSmallerRight(A);

        int maxArea = 0;
        for(int i = 0; i < A.size(); i++){
            int width = rb[i]-lb[i]-1;
            int area = width*A.get(i);
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }

    public int[] nextSmallerLeft(ArrayList<Integer> A){
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[A.size()];
        ans[0] = -1;
        s.push(0);
        for(int i = 1; i < A.size(); i++){
            while(!s.isEmpty() && A.get(i) <= A.get(s.peek())) s.pop();
            ans[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }
        return ans;
    }
    public int[] nextSmallerRight(ArrayList<Integer> A){
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[A.size()];
        ans[A.size()-1] = A.size();
        s.push(A.size()-1);
        for(int i = A.size()-2; i >= 0; i--){
            while(!s.isEmpty() && A.get(i) <= A.get(s.peek())) s.pop();
            ans[i] = s.empty() ? A.size() : s.peek();
            s.push(i);
        }
        return ans;
    }
}
