package SDE.Day14;

// https://www.interviewbit.com/problems/nearest-smaller-element/
// Next Smaller Element (On the left) (InterviewBit)

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        int nums[] = {39, 27, 11, 4, 24, 32, 32, 1};
        for(int i: nums) A.add(i);
        ArrayList<Integer> ans = prevSmaller(A);
        for(int i: ans) System.out.print(i + " ");
        System.out.println();
    }
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        int[] ans = new int[A.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(A.get(0));
        ans[0] = -1;

        for(int i = 1; i < A.size(); i++){
            while(!stack.empty() && A.get(i) < stack.peek()) stack.pop();
            ans[i] = stack.empty() ? -1 : stack.peek();
            stack.push(A.get(i));
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: ans) list.add(i);
        return list;
    }
}
