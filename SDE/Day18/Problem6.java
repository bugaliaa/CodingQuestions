package SDE.Day18;

// https://leetcode.com/problems/balanced-binary-tree/
// Balanced Binary Tree (LeetCode)

import SDE.Classes.LeetCode.TreeNode;

public class Problem6 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return dfsHeight(root) != -1;
    }
    public int dfsHeight(TreeNode root){
        if(root == null) return 0;

        int leftHeight = dfsHeight(root.left);
        if(leftHeight == -1) return -1;
        int rightHeight = dfsHeight(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
