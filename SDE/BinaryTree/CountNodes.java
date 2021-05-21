package SDE.BinaryTree;

import SDE.Classes.BinaryTreeNode;

public class CountNodes {
    public static int countNodes(BinaryTreeNode<Integer> root){
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
