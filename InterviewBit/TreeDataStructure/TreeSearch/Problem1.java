package InterviewBit.TreeDataStructure.TreeSearch;

// https://www.interviewbit.com/problems/least-common-ancestor/
// Least Common Ancestor

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
    int c;
    public int lca(TreeNode A, int B, int C) {
        c = 0;
        
        TreeNode node = helper(A, B, C);
        if(c == 2) return node.val;
        else if(B == C && c == 1) return node.val;

        return -1;
    }
    public TreeNode helper(TreeNode root, int B, int C){
        if(root == null) return null;
        
        TreeNode left = helper(root.left, B, C);
        TreeNode right = helper(root.right, B, C);
        if(root.val == B || root.val == C){
            c++;
            return root;
        }
        
        if(left != null && right != null) return root;
        if(right == null) return left;

        return right;
    }
}
