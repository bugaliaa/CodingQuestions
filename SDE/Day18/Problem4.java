package SDE.Day18;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Minimum Depth of binary tree (LeetCode)

public class Problem4 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left+right+1 : Math.min(left, right)+1;
    }
}
