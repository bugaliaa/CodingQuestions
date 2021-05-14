package SDE.Day13;

import java.util.*;

// Implementation of Stack using 2 Queues Part1 (usisng push costly)

public class Problem5 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int data){
        q2.add(data);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    public void pop(){
        if(q1.isEmpty()) return;
        q1.remove();
    }
    public int peek(){
        if(q1.isEmpty()) return -1;
        return q1.peek();
    }
}
