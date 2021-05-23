package SDE.Day17;

import java.util.*;

import SDE.Classes.LeetCode.TreeNode;

// Inorder Traversal of Binary Tree (LeetCode)
// https://leetcode.com/problems/binary-tree-inorder-traversal/

public class Problem1 {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
