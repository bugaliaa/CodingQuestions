package InterviewBit.TreeDataStructure.BSTTraversal;

// https://www.interviewbit.com/old/problems/kth-smallest-element-in-tree/
// Kth Smallest Element is a tree

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
    private int count = 0;
    private int number = 0;
    public int kthsmallest(TreeNode A, int B) {
        count = B;
        inorder(A);
        return number;
    }
    public void inorder(TreeNode root){
        if(root.left != null) inorder(root.left);
        count--;
        if(count == 0){
            number = root.val;
            return;
        }
        if(root.right != null) inorder(root.right);
    }
}
