package SDE.Day18;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// Binary Tree Spiral Level Order Traversal (LeetCode)

import java.util.*;
import SDE.Classes.LeetCode.TreeNode;

public class Problem2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        boolean order = true;
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            LinkedList<Integer> subList = new LinkedList<>();
            while(size-- > 0){
                TreeNode node = q.poll();
                if(order) subList.add(node.val);
                else subList.addFirst(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            order = !order;
            list.add(subList);
        }

        return list;
    }
}
