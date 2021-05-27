package SDE.Day21;

import SDE.Classes.LeetCode.TreeNode;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
//Kth smallest element is a bst (LeetCode)

public class Problem2 {
    private int number = 0;
    private int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return number;
    }
    public void inorder(TreeNode root){
        if(root.left != null) inorder(root.left);
        count--;
        if(count == 0){
            number = root.val;
            return;
        }
        if(root.right != null) inorder(root.right);
    }
}
