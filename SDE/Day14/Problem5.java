package SDE.Day14;

// https://leetcode.com/problems/min-stack
// Min Stack (LeetCode)

public class Problem5 {
    class MinStack {

        private Node head;

        public MinStack() {
            
        }
        
        public void push(int val) {
            if(head == null){
                head = new Node(val, val);
            }else{
                head = new Node(val, Math.min(val, head.min), head);
            }
        }
        
        public void pop() {
            head = head.next;
        }
        
        public int top() {
            return head.val;
        }
        
        public int getMin() {
            return head.min;
        }

        private class Node{
            int val;
            int min;
            Node next;

            private Node(int val, int min){
                this(val, min, null);
            }
            private Node(int x, int min, Node next){
                this.val = x;
                this.min = min;
                this.next = next;
            }
        }
    }
}
