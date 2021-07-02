package InterviewBit.TreeDataStructure.TwoTrees;

// https://www.interviewbit.com/problems/merge-two-binary-tree/
// Merge Two Binary Trees

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
    public TreeNode solve(TreeNode A, TreeNode B) {
        if(A == null && B == null) return null;

        int val = (A == null ? 0 : A.val) + (B == null ? 0 : B.val);
        TreeNode node = new TreeNode(val);
        node.left = solve(A == null ? null : A.left, B == null ? null : B.left);
        node.right = solve(A == null ? null : A.right, B == null ? null : B.right);

        return node;
    }
}
