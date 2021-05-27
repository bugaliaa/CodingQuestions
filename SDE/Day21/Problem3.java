package SDE.Day21;

// Kth Largest element in a BST

import SDE.Classes.LeetCode.TreeNode;

public class Problem3 {
    private int count = 0;
    private int number = 0;

    public int kthLargest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return number;
    }
    public void inorder(TreeNode root){
        if(root.right != null) inorder(root.right);
        count--;
        if(count == 0){
            number = root.val;
            return;
        }
        if(root.left != null) inorder(root.left);
    }
}
