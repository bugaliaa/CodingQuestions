package InterviewBit.TreeDataStructure.RootToLeaf;

// https://www.interviewbit.com/problems/sum-root-to-leaf-numbers/
// Sum Root to Leaf Numbers

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
    public int sumNumbers(TreeNode A) {
        return helper(A, 0)%1003;
    }
    public int helper(TreeNode A, int val){
        if(A == null) return 0;

        val = ((((val*10)%1003)%1003) + (A.val%1003))%1003;

        if(A.left == null && A.right == null) return val%1003;

        return helper(A.left, val) + helper(A.right, val);
    }
}
