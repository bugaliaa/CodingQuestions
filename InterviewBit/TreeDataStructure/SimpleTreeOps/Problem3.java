package InterviewBit.TreeDataStructure.SimpleTreeOps;

// https://www.interviewbit.com/problems/balanced-binary-tree/
// Balanced Binary Tree

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
    public int isBalanced(TreeNode A) {
        if(A == null) return 1;
        return dfs(A) != -1 ? 1 : 0;
    }
    public int dfs(TreeNode A){
        if(A == null) return 0;

        int leftHeight = dfs(A.left);
        if(leftHeight == -1) return -1;
        
        int rightHeight = dfs(A.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight-rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight)+1;
    }
}
