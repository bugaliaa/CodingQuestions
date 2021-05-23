package SDE.Day17;

// https://leetcode.com/problems/binary-tree-right-side-view/
// Right View of Binary Tree (LeetCode)

import java.util.*;
import SDE.Classes.LeetCode.TreeNode;

public class Problem4 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                TreeNode curr = q.poll();
                if(size == 0) list.add(curr.val);

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return list;
    }
}
