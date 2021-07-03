package InterviewBit.TreeDataStructure.Traversal;

// https://www.interviewbit.com/problems/postorder-traversal/
// Postorder Traversal

import java.util.*;

public class Problem5 {
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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        if(A == null) return list;
        Stack<TreeNode> s = new Stack<>();
        TreeNode prev = null;
        s.push(A);

        while(!s.isEmpty()){
            TreeNode curr = s.peek();
            if(prev == null || prev.left == curr || prev.right == curr){
                if(curr.left != null) s.push(curr.left);
                else if(curr.right != null) s.push(curr.right);
                else{
                    s.pop();
                    list.add(curr.val);
                }
            }else if(curr.left == prev){
                if(curr.right != null) s.push(curr.right);
                else{
                    s.pop();
                    list.add(curr.val);
                }
            }else if(curr.right == prev){
                s.pop();
                list.add(curr.val);
            }
            prev = curr;
        }

        return list;
    }
}
