package SDE.Day5;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list
// Remove the Nth Node from the end of the list

public class Problem4 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){ } 
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
    public static void main(String[] args) {
        
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(n == count) return head.next;
        temp = head;
        while(temp != null && count > n){
            temp = temp.next;
            count--;
        }
        count--;
        temp.next = temp.next.next;
        return head;
    }
}
