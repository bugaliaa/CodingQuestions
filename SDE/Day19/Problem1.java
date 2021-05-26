package SDE.Day19;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Binary Tree Maximum Path Sum (LeetCode)

public class Problem1 {
    public int maxPathSum(TreeNode root) {
        int ans[] = {Integer.MIN_VALUE};
        pathSum(root, ans);
        return ans[0];
    }
    public int pathSum(TreeNode root, int[] ans){
        if(root == null) return 0;

        int leftPathSum = Math.max(0, pathSum(root.left, ans));
        int rightPathSum = Math.max(0, pathSum(root.right, ans));

        ans[0] = Math.max(ans[0], leftPathSum+rightPathSum+root.val);
        return Math.max(leftPathSum, rightPathSum) + root.val;
    }
}
