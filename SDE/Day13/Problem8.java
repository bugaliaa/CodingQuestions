package SDE.Day13;

import java.util.*;

// Implementatin of Queue using stacks (Enqueue costly)
// Front is at top of stack and Rear is at bottom of stack

public class Problem8 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int data){
        while(!s1.empty()) s2.push(s1.pop());
        s1.push(data);
        while(!s2.empty()) s1.push(s2.pop());
    }
    public int dequeue(){
        if(s1.isEmpty()) return -1;
        return s1.pop();
    }
    public int peek(){
        if(s1.isEmpty()) return -1;
        return s1.peek();
    }
}
