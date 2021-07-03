package InterviewBit.TreeDataStructure.Traversal;

// https://www.interviewbit.com/problems/preorder-traversal/
// Preorder Traversal

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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        Stack<TreeNode> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(A == null) return list;

        s.push(A);

        while(!s.isEmpty()){
            TreeNode node = s.pop();
            list.add(node.val);

            if(node.right != null){
                s.push(node.right);
            }
            if(node.left != null){
                s.push(node.left);
            }
        }
        return list;
    }
}
