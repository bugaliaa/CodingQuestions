package InterviewBit.Backtracking.MathsAndBacktracking;

// https://www.interviewbit.com/problems/gray-code/
// Gray Code

import java.util.*;

public class Problem3 {
    public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = (int)Math.pow(2, a);
        helper(a, list, size, 0);
        return list;
    }
    public void helper(int n, ArrayList<Integer> list, int size, int num){
        if(num == size) return;

        int pow = num/2;
        list.add(num^pow);
        helper(n, list, size, num+1);
    }
}
