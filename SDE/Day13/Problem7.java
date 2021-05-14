package SDE.Day13;

import java.util.*;

// Implementation of Queues using Stack Part1 (Costly dequeue)

public class Problem7 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    public void enqueue(int data){
        s1.add(data);
    }
    public int dequeue(){
        if(s1.empty()) return -1;
        while(!s1.empty()){
            s2.add(s1.pop());
        }
        int temp = s2.pop();
        while(!s2.empty()){
            s1.add(s2.pop());
        }
        return temp;
    }
    public int peek(){
        if(s1.isEmpty()) return -1;
        while(!s1.isEmpty()){
            s2.add(s1.pop());
        }
        int temp = s2.peek();
        while(!s2.empty()) s1.add(s2.pop());
        return temp;
    }
}
