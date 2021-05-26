package SDE.BinarySearchTree;

import SDE.Classes.LeetCode.TreeNode;

public class PrintInARange {
    public void printRange(TreeNode root, int low, int high){
        if(root == null) return;
        if(root.val < low) printRange(root.right, low, high);
        if(root.val > high) printRange(root.left, low, high);
        System.out.println(root.val + " ");
    }
}
