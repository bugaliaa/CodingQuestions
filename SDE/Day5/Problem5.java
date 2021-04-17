package SDE.Day5;

//https://leetcode.com/problems/delete-node-in-a-linked-list/
//Delete node in a linked list

import SDE.Classes.ListNode;

public class Problem5 {
    public static void main(String[] args) {
        
    }
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
