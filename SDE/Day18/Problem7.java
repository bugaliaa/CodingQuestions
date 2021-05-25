package SDE.Day18;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Lowest Common Ancestor(LCA) of a Binary Tree (LeetCode)

public class Problem7 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;

        TreeNode leftSearchResult = lowestCommonAncestor(root.left, p, q);
        TreeNode rightSearchResult = lowestCommonAncestor(root.right, p, q);

        if(leftSearchResult == null) return rightSearchResult;
        if(rightSearchResult == null) return leftSearchResult;

        return root;
    }
}
