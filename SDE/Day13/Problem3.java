package SDE.Day13;

// Implementation of Queue using LinkedList

import SDE.Classes.ListNode;

public class Problem3 {
    ListNode front = null;
    ListNode rear = null;

    public void enqueue(int data){
        ListNode node = new ListNode(data);
        node.next = null;
        if(isEmpty()){
            front = rear = node;
        }else{
            rear.next = node;
            rear = rear.next;
        }
    }
    public void dequeue(){
        if(isEmpty()) System.out.println("UNDERFLOW");
        else if(front == rear){
            front = null;
            rear = null;
        }else{
            front = front.next;
        }
    }
    public boolean isEmpty(){
        return (front == null && rear == null);
    }
    public int peek(){
        if(isEmpty()) return -1;
        return front.val;
    }
    public void display(){
        if(isEmpty()) System.out.println("EMPTY");
        else{
            ListNode temp = front;
            while(temp != null){
                System.out.println(temp.val + " ");
                temp = temp.next;
            }
        }
    }
}
