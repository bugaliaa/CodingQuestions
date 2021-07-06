package InterviewBit.TreeDataStructure.LevelOrder;

// https://www.interviewbit.com/problems/zigzag-level-order-traversal-bt/
// Zigzag Level Order Traversal BT

import java.util.*;

public class Problem4 {
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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(A == null) return list;
        Queue<TreeNode> q = new ArrayDeque<>();
        boolean order = true;
        q.add(A);
        while(!q.isEmpty()){
            ArrayList<Integer> subList = new ArrayList<>();
            int size = q.size();
            while(size-- > 0){
                TreeNode node = q.poll();
                subList.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            if(order){
                list.add(subList);
            }else{
                Collections.reverse(subList);
                list.add(subList);
            }
            order = !order;
        }

        return list;
    }
}
