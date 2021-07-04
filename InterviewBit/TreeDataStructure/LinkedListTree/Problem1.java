package InterviewBit.TreeDataStructure.LinkedListTree;

// https://www.interviewbit.com/problems/flatten-binary-tree-to-linked-list/
// Flatten Binary tree to Linked List

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
    public TreeNode flatten(TreeNode a) {
        helper(a);
        return a;        
    }
    public void helper(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;

        if(root.left != null){
            helper(root.left);

            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;

            TreeNode curr = root.right;
            while(curr.right != null){
                curr = curr.right;
            }

            curr.right = temp;
        }

        helper(root.right);
    }
}
