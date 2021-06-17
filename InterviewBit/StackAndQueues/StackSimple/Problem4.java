package InterviewBit.StackAndQueues.StackSimple;

// https://www.interviewbit.com/problems/min-stack/
// Min Stack

public class Problem4 {

    private Node head;

    public void push(int x) {
        if(head == null) head = new Node(x, x);
        else head = new Node(x, Math.min(head.min, x), head);
    }

    public void pop() {
        head = head == null ? head = null : head.next;
    }

    public int top() {
        return head == null ? -1 : head.val;
    }

    public int getMin() {
        return head == null ? -1 : head.min;
    }

    private class Node{
        int val;
        int min;
        Node next;

        Node(int val, int min){
            this.val = val;
            this.min = min;
        }

        Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
