package SDE.Day17;

// https://leetcode.com/problems/binary-tree-postorder-traversal/
// Binary Traversal Binary Tree (LeetCode)

import java.util.*;
import SDE.Classes.LeetCode.TreeNode;

public class Problem3 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    public void postorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }
}
