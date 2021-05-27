package SDE.Day20;

// https://leetcode.com/problems/search-in-a-binary-search-tree/
// Search a given key in BST (LeetCode)

import SDE.Classes.LeetCode.TreeNode;

public class Problem2 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        if(root.val < val) return searchBST(root.right, val);
        return searchBST(root.left, val); 
    }
}
