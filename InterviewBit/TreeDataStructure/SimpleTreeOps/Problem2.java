package InterviewBit.TreeDataStructure.SimpleTreeOps;

// https://www.interviewbit.com/problems/remove-half-nodes/
// Remove Half Nodes

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
    public TreeNode solve(TreeNode A) {
        if(A == null) return null;

        A.left = solve(A.left);
        A.right = solve(A.right);

        if(A.left == null && A.right == null) return A;

        if(A.left == null) return A.right;

        if(A.right == null) return A.left;

        return A;
    }
}
