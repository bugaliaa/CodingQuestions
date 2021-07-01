package InterviewBit.TreeDataStructure.RootToLeaf;

// https://www.interviewbit.com/problems/min-depth-of-binary-tree/
// Min Depth of Binary Tree

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
    public int minDepth(TreeNode A) {
        if(A == null) return 0;

        if(A.left == null && A.right == null) return 1;

        if(A.left == null) return minDepth(A.right)+1;

        if(A.right == null) return minDepth(A.left)+1;

        return Math.min(minDepth(A.left), minDepth(A.right))+1;
    }
}
