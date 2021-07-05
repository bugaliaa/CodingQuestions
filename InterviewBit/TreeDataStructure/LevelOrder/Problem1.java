package InterviewBit.TreeDataStructure.LevelOrder;

// https://www.interviewbit.com/problems/right-view-of-binary-tree/
// Right View of Binary Tree

import java.util.*;

public class Problem1 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        if(A == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                TreeNode node = q.poll();
                if(size == 0) list.add(node.val);

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }

        return list;
    }
}
