package SDE.Day18;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
// Level Order Traversal Binary Tree (LeetCode)

import java.util.*;

import SDE.Classes.LeetCode.TreeNode;

public class Problem1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> subList = new ArrayList<>();
            while(size-- > 0){
                TreeNode node = q.poll();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                subList.add(node.val);
            }
            list.add(subList);
        }
        return list;
    }
}
