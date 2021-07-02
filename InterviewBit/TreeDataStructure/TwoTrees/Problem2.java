package InterviewBit.TreeDataStructure.TwoTrees;

// https://www.interviewbit.com/problems/symmetric-binary-tree/
// Symmetric Binary Tree

public class Problem2 {
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
    public int isSymmetric(TreeNode A) {
        return A == null ? 1 : (helper(A.left, A.right) ? 1 : 0);
    }
    public boolean helper(TreeNode A, TreeNode B){
        if(A == null || B == null) return A == B;
        if(A.val != B.val) return false;
        return helper(A.left, B.right) && helper(A.right, B.left);
    }
}
