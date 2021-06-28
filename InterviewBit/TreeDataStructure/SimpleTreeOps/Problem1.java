package InterviewBit.TreeDataStructure.SimpleTreeOps;

// https://www.interviewbit.com/problems/path-to-given-node/
// Path to given node

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
    public ArrayList<Integer> solve(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        search(root, k, list);
        Collections.reverse(list);
        return list;
    }
    public boolean search(TreeNode root, int k, ArrayList<Integer> list){
        if(root == null) return false;

        if(root.val == k){
            list.add(root.val);
            return true;
        }

        boolean lp = search(root.left, k, list);
        if(lp){
            list.add(root.val);
            return true;
        }

        boolean rp = search(root.right, k, list);
        if(rp){
            list.add(root.val);
            return true;
        }

        return false;
    }
}
