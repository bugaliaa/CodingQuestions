package SDE.Day17;

// https://leetcode.com/problems/binary-tree-preorder-traversal/
// Preorder Traversal Binary Tree (LeetCode)

import java.util.*;
import SDE.Classes.LeetCode.TreeNode;

public class Problem2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }
    public void preorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
