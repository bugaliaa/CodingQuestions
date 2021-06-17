package InterviewBit.StackAndQueues.StackSimple;

// https://www.interviewbit.com/problems/redundant-braces/
// Redundant Braces

import java.util.*;

public class Problem3 {
    public int braces(String A) {
        Stack<Character> s = new Stack<>();
        char[] a = A.toCharArray();

        for(int i = 0; i < a.length; i++){
            if(a[i] == ')'){
                char top = s.pop();

                boolean flag = true;

                while(top != '('){
                    if(top == '+' || top == '-' || top == '*' || top == '/') flag = false;

                    top = s.pop();
                }

                if(flag) return 1;
            }else{
                s.push(a[i]);
            }
        }

        return 0;
    }
}
