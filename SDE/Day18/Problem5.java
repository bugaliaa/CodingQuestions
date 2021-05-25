package SDE.Day18;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/diameter-of-binary-tree/
// Diameter of Binary Tree (LeetCode)

public class Problem5 {
    public int diameterOfBinaryTree(TreeNode root) {
        int ans[] = helper(root);
        return ans[1];
    }
    public int[] helper(TreeNode root){
        if(root == null){
            int[] p = new int[2];
            p[0] = 0;
            p[1] = 0;
            return p;
        }

        int leftAns[] = helper(root.left);
        int rightAns[] = helper(root.right);

        int lh = leftAns[0];
        int rh = rightAns[0];
        int ld = leftAns[1];
        int rd = rightAns[1];

        int height = 1 + Math.max(rh, lh);
        int diameter = Math.max(rh+lh, Math.max(ld, rd));

        int[] p = new int[2];
        p[0] = height;
        p[1] = diameter;

        return p;
    }
}
