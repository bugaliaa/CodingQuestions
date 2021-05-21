package SDE.Trees;

import SDE.Classes.TreeNode;

public class DeleteTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>();
        deleteTree(root);
    }
    public static void deleteTree(TreeNode<Integer> root) {
        root = null;
    }
}
