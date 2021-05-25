package SDE.Day18;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/same-tree/
// Check if tree is identical or not (LeetCode)

public class Problem8 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val) return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }
}
