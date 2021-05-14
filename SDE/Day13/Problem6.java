package SDE.Day13;

import java.util.*;

// Implement Stack using 2 Qs Part2 (POP costly)

public class Problem6 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    
    public void pop(){
        if(q1.isEmpty()) return;
        while(q1.size() != 1){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    public void push(int data){
        q1.add(data);
    }
    public int peek(){
        if(q1.isEmpty()) return -1;
        while(q1.size() != 1){
            q2.add(q1.peek());
            q1.remove();
        }
        int temp = q1.peek();
        q1.remove();
        q2.add(temp);
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return temp;
    }
}
