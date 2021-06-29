package InterviewBit.TreeDataStructure.InplaceChange;

// https://www.interviewbit.com/problems/invert-the-binary-tree/
// Invert the Binary Tree

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
    public TreeNode invertTree(TreeNode A) {
        if(A == null) return null;

        TreeNode temp = A.left;
        A.left = invertTree(A.right);
        A.right = invertTree(temp);

        return A;
    }
}
