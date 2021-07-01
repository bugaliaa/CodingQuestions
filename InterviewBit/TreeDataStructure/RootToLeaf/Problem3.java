package InterviewBit.TreeDataStructure.RootToLeaf;

// https://www.interviewbit.com/problems/path-sum/
// Path Sum

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
    public int hasPathSum(TreeNode root, int k) {
        if(root == null) return 0;
        if(root.val == k && root.left == null && root.right == null) return 1;
        if(hasPathSum(root.left, k-root.val) == 1) return 1;
        return hasPathSum(root.left, k-root.val);
    }
}
