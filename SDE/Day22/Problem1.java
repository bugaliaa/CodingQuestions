package SDE.Day22;

import SDE.Classes.GFG.Node;

// https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
// Binary Tree to Doubly Linked List (GFG)

public class Problem1 {
    Node bToDLL(Node root){
        Node head = null;
        Node prev = null;
        return helper(root, head, prev);
    }
    Node helper(Node root, Node head, Node prev){
        if(root == null) return null;

        helper(root.left, head, prev);
        if(prev == null){
            head = root;
        }else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        helper(root.right, head, prev);
        return head;
    }
}
