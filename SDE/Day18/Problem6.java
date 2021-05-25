package SDE.Day18;

// https://leetcode.com/problems/balanced-binary-tree/
// Balanced Binary Tree (LeetCode)

import SDE.Classes.LeetCode.TreeNode;

public class Problem6 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left = 0;
        int right = 0;
        if(root.left != null) left = height(root.left);
        if(root.right != null) right = height(root.right);
        if(Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right)) return true;
        return false; 
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
