package SDE.Day6;

// https://leetcode.com/problems/rotate-list
// Rotate List

public class Problem7 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(){ } 
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
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