package SDE.Day6;

import SDE.Classes.ListNode;

// https://leetcode.com/problems/rotate-list
// Rotate List

public class Problem7 {
    public static void main(String[] args) {
        
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        ListNode temp = head;
        int len = 1;
        while(temp.next != null){
            temp = temp.next;
            len++;
        }
        temp.next = head;
        k = k%len;

        int i = len - k;
        while(i > 0){
            temp = temp.next;
            i--;
        }
        head = temp.next;
        temp.next = null;
        return head;

    }
}
