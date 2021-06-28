package InterviewBit.TreeDataStructure.BSTTraversal;

// https://www.interviewbit.com/problems/bst-iterator/
// BST Iterator

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
    Queue<TreeNode> q;
    public Problem4(TreeNode root) {
        q = new LinkedList<>();
        inorder(root);
    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        q.add(root);
        inorder(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return q.isEmpty() ? false : true;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode x = q.poll();
        return x.val;
    }
}
