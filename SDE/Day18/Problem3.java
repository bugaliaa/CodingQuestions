package SDE.Day18;

// Height/Maximum Depth of a Binary Tree (LeetCode)
// https://leetcode.com/problems/maximum-depth-of-binary-tree/

import SDE.Classes.LeetCode.TreeNode;

public class Problem3 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
