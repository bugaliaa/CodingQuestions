package SDE.Day5;

//https://leetcode.com/problems/delete-node-in-a-linked-list/
//Delete node in a linked list

public class Problem5 {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){ } 
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
    public static void main(String[] args) {
        
    }
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
