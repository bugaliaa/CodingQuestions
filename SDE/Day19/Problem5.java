package SDE.Day19;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
// Flatten Binary Tree to Linked List (LeetCode)

public class Problem5 {
    public void flatten(TreeNode root) {
        flatten(root, null);
    }
    public TreeNode flatten(TreeNode root, TreeNode prev){
        if(root == null) return prev;
        
        flatten(root.right, prev);
        flatten(root.left, prev);

        root.right = prev;
        root.left = null;

        prev = root;

        return prev;
    }
}
