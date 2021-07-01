package InterviewBit.TreeDataStructure.RootToLeaf;

// https://www.interviewbit.com/problems/max-depth-of-binary-tree/
// Max Depth of Binary Tree

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
    public int maxDepth(TreeNode A) {
        if(A == null) return 0;
        return 1 + Math.max(maxDepth(A.left), maxDepth(A.right));
    }
}
