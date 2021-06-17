package InterviewBit.StackAndQueues.StackSimple;

// https://www.interviewbit.com/problems/simplify-directory-path/
// Simplify Directory Path

import java.util.*;

public class Problem2 {
    public String simplifyPath(String A) {
        StringBuilder sb = new StringBuilder();
        StringBuilder dir = new StringBuilder();
        Stack<String> s = new Stack<>();
        Stack<String> s2 = new Stack<>();

        sb.append('/');

        char[] a = A.toCharArray();

        for(int i = 0; i < a.length; i++){
            dir.setLength(0);

            while(i < a.length && a[i] == '/') i++;

            while(i < a.length && a[i] != '/'){
                dir.append(a[i]);
                i++;
            }

            if(dir.toString().equals("..")){
                if(!s.isEmpty()) s.pop();
            }else if(dir.toString().equals(".")) continue;
            else if(dir.length() != 0) s.push(dir.toString());
        }

        while(!s.isEmpty()){
            s2.push(s.pop());
        }

        while(!s2.isEmpty()){
            if(s2.size() != 1) sb.append(s2.pop() + "/");
            else sb.append(s2.pop());
        }

        return sb.toString();
    }
}
