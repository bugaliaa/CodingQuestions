package SDE.Day20;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
// LCA of a BST (LeetCode)

public class Problem5 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.left, p, q);
        if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
