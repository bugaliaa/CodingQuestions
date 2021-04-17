package SDE.Day6;

import SDE.Classes.ListNode;

// https://leetcode.com/problems/linked-list-cycle-ii
// Linked List Cycle II

public class Problem5 {
    public static void main(String[] args) {
        
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        while(head != slow){
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}
