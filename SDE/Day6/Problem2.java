package SDE.Day6;

import SDE.Classes.ListNode;

// https://leetcode.com/problems/linked-list-cycle
// Linked List Cycle

public class Problem2 {
    public static void main(String[] args) {
        
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
