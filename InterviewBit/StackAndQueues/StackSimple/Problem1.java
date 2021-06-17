package InterviewBit.StackAndQueues.StackSimple;

// https://www.interviewbit.com/problems/balanced-parantheses/
// Balanced Parentheses

import java.util.*;

public class Problem1 {
    public int solve(String A) {
        Stack<Character> s = new Stack<>();

        for(char c: A.toCharArray()){
            if(c == '(') s.add(c);
            else if(c == ')'){
                if(s.size() == 0) return 0;
                s.pop();
            }
        }
        if(s.size() == 0) return 1;
        
        return 0;
    }
}
