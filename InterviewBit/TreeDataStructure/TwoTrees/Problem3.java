package InterviewBit.TreeDataStructure.TwoTrees;

// https://www.interviewbit.com/problems/identical-binary-trees/
// Identical Binary Trees

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
    public int isSameTree(TreeNode A, TreeNode B) {
        return helper(A, B) ? 1 : 0;
    }
    public boolean helper(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        if(p.val == q.val) return helper(p.left, q.left) && helper(p.right, q.right);
        return false;
    }
}
