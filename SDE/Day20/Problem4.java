package SDE.Day20;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/validate-binary-search-tree/
// Check if a BT is a BST (LeetCode)

public class Problem4 {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean validate(TreeNode root, long min, long max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        boolean isLeft = validate(root.left, min, root.val);
        boolean isRight = validate(root.right, root.val, max);
        return isLeft && isRight;
    }
}
