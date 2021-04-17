package SDE.Day5;

// https://leetcode.com/problems/reverse-linked-list/
// Reverse a Linked List

import SDE.Classes.ListNode;

public class Problem1 {
    public static void main(String[] args) {
        
    }
    public ListNode reverseList(ListNode head){
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
