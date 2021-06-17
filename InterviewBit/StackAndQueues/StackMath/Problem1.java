package InterviewBit.StackAndQueues.StackMath;

// https://www.interviewbit.com/problems/evaluate-expression/
// Evaluate Expression

import java.util.*;

public class Problem1 {
    public int evalRPN(ArrayList<String> A) {
        Stack<String> s = new Stack<>();
        for(int i = 0; i < A.size(); i++){
            if(A.get(i).equals("+") || A.get(i).equals("-") || A.get(i).equals("*") || A.get(i).equals("/")){
                int x = Integer.parseInt(s.pop());
                int y = Integer.parseInt(s.pop());
                
                String c = A.get(i);
                if(c.equals("+")) s.add(Integer.toString(y+x));
                else if(c.equals("-")) s.add(Integer.toString(y-x));
                else if(c.equals("*")) s.add(Integer.toString(y*x));
                else if(c.equals("/")) s.add(Integer.toString(y/x));
            }else{
                s.push(A.get(i));
            }
        }

        return Integer.parseInt(s.peek());
    }
}
