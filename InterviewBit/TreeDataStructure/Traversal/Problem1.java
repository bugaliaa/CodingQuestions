package InterviewBit.TreeDataStructure.Traversal;

// https://www.interviewbit.com/problems/vertical-order-traversal-of-binary-tree/
// Vertical Order Traversal of Binary Tree

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
    class vPair{
        TreeNode node = null;
        int hl = 0;
        vPair(TreeNode node, int hl){this.node = node; this.hl = hl;}
    }
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(A == null) return list;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        Queue<vPair> q = new LinkedList<>();
        int minHl = 0;
        int maxHl = 0;

        q.add(new vPair(A, 0));
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                vPair rp = q.poll();

                maxHl = Math.max(maxHl, rp.hl);
                minHl = Math.min(minHl, rp.hl);

                map.putIfAbsent(rp.hl, new ArrayList<>());
                map.get(rp.hl).add(rp.node.val);

                if(rp.node.left != null) q.add(new vPair(rp.node.left, rp.hl-1));
                if(rp.node.right != null) q.add(new vPair(rp.node.right, rp.hl+1));
            }
        }

        for(int i = minHl; i <= maxHl; i++){
            list.add(map.get(i));
        }

        return list;
    }
}
