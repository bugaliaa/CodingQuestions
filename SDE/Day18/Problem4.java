package SDE.Day18;

import SDE.Classes.LeetCode.TreeNode;
import java.util.*;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Minimum Depth of binary tree (LeetCode)

public class Problem4 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int level = 1;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                TreeNode node = q.poll();
                if(node.left == null && node.right == null) return level;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            level++;
        }

        return level;
    }
}
