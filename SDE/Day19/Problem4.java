package SDE.Day19;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/symmetric-tree/
// Symmetric Tree (LeetCode)

public class Problem4 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }
    public boolean helper(TreeNode left, TreeNode right){
        if(left == null || right == null) return left == right;
        if(left.val != right.val) return false;
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}
