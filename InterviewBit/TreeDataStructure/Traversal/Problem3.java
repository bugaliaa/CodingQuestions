package InterviewBit.TreeDataStructure.Traversal;

// https://www.interviewbit.com/problems/inorder-traversal/
// Inorder Traversal

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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        if(A == null) return list;
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = A.left;
        s.push(A);

        while(s.size() > 0 || curr != null){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            TreeNode temp = s.pop();
            list.add(temp.val);
            curr = temp.right;
        }

        return list;
    }
}
