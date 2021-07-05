package InterviewBit.TreeDataStructure.LevelOrder;

// https://www.interviewbit.com/problems/reverse-level-order/
// Reverse Level Order

import java.util.*;

public class Problem3 {
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
        Stack<TreeNode> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            s.push(node);

            if(node.right != null) q.add(node.right);
            if(node.left != null) q.add(node.left);
        }

        while(!s.isEmpty()){
            list.add(s.pop().val);
        }

        return list;
    }
}
