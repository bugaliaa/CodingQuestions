package SDE.BinarySearchTree;

import SDE.Classes.LeetCode.TreeNode;

public class CheckIfBST {
    public boolean isBST(TreeNode root){
        if(root == null) return true;
        
        int leftMax = max(root.left);
        int rightMin = min(root.right);

        if(root.val > leftMax && root.val <= rightMin && isBST(root.left) && isBST(root.right)) return true;
        return false;
    }
    public int max(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    public int min(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
}
