package SDE.Day5;

// https://leetcode.com/problems/reverse-linked-list/
// Reverse a Linked List

public class Problem1 {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(){ }
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
    public static void main(String[] args) {
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = curr;

        while(next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }    
} 
