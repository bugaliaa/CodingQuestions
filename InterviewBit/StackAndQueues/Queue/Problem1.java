package InterviewBit.StackAndQueues.Queue;

// https://www.interviewbit.com/problems/first-non-repeating-character-in-a-stream-of-characters/
// First Non-repeating character in a stream of characters

import java.util.*;

public class Problem1 {
    public String solve(String A) {
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int count[] = new int[26];

        for(int i = 0; i < A.length(); i++){
            char c = A.charAt(i);
            q.add(c);
            count[c - 'a']++;
            while(!q.isEmpty()){
                if(count[(int)q.peek()-'a'] > 1) q.remove();
                else {
                    sb.append(q.peek());
                    break;
                } 
            }
            if(q.isEmpty()) sb.append("#");
        }

        return sb.toString();
    }
}
