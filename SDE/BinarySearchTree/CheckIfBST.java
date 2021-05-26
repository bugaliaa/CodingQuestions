package SDE.BinarySearchTree;

import SDE.Classes.LeetCode.TreeNode;

class isBSTReturn{
    boolean isBST;
    int max;
    int min;
}

public class CheckIfBST {
    // Method 1
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
    // Method 2
    public boolean isBST3(TreeNode root, int min, int max){
        if(root == null) return true;
        if(root.val < min || root.val > max) return false;
        boolean isLeft = isBST3(root.left, min, root.val-1);
        boolean isRight = isBST3(root.right, root.val+1, max);
        return isLeft && isRight;
    }
    public boolean isBST(TreeNode root){
        isBSTReturn t = new isBSTReturn();
        return t.isBST;
    }
}
