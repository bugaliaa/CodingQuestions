package SDE.BinarySearchTree;

import SDE.Classes.LeetCode.TreeNode;

class isBSTReturn{
    boolean isBST;
    int max;
    int min;
}

public class CheckIfBST {
    public isBSTReturn isBST2(TreeNode root){
        if(root == null){
            isBSTReturn output = new isBSTReturn();
            output.isBST = true;
            output.max = Integer.MIN_VALUE;
            output.min = Integer.MAX_VALUE;
            return output;
        }
        isBSTReturn leftOutput = isBST2(root.left);
        isBSTReturn rightOutput = isBST2(root.right);
        int min = Math.min(root.val, Math.min(leftOutput.min, rightOutput.min));
        int max = Math.max(root.val, Math.max(leftOutput.max, rightOutput.max));
        boolean isBSTFinal = root.val > leftOutput.max && root.val <= rightOutput.min && leftOutput.isBST && rightOutput.isBST;
        
        isBSTReturn output = new isBSTReturn();
        output.max = max;
        output.min = min;
        output.isBST = isBSTFinal;
        
        return output;
    }
    public boolean isBST(TreeNode root){
        isBSTReturn t = new isBSTReturn();
        return t.isBST;
    }
}
