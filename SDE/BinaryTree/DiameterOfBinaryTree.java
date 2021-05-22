package SDE.BinaryTree;

import SDE.Classes.BinaryTreeNode;

// Diameter of a binary tree

public class DiameterOfBinaryTree {
    public static int[] diameterHeight(BinaryTreeNode<Integer> root){
        if(root == null){
            int[] p = new int[2];
            p[0] = 0;
            p[1] = 0;
            return p;
        }
        
        int[] leftAns = diameterHeight(root.left);
        int[] rightAns = diameterHeight(root.right);
        
        int ld = leftAns[1];
        int lh = leftAns[0];
        int rd = rightAns[1];
        int rh = rightAns[0];

        int height = 1 + Math.max(lh, rh);
        int diameter = Math.max(rh+lh, Math.max(ld, rd));
        int[] p = new int[0];
        p[0] = height;
        p[1] = diameter;
        return p;
    }
    // public static int diameter(BinaryTreeNode<Integer> root){
    //     if(root == null) return 0;

    //     int option1 = height(root.right) + height(root.left);
    //     int option2 = diameter(root.left);
    //     int option3 = diameter(root.right);

    //     return Math.max(option1, Math.max(option2, option3));
    // }
    // public static int height(BinaryTreeNode<Integer> root){
    //     if(root == null) return 0;

    //     return 1 + Math.max(height(root.left), height(root.right));
    // }
}
