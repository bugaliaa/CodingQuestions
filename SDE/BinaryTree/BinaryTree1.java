package SDE.BinaryTree;

import SDE.Classes.BinaryTreeNode;
import java.util.*;

public class BinaryTree1<T> {
    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        // BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
        // BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(3);
        // root.left = node1;
        // root.right = node2;
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        printTree(root);
    }
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null) return;
        System.out.print(root.data + ": ");
        if(root.left != null) System.out.print("L" + root.left.data);
        if(root.right != null) System.out.print(" R" + root.right.data);
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        System.out.print("Enter data: ");
        int rootData = sc.nextInt();
        
        if(rootData == -1) return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> left = takeInput(sc);
        BinaryTreeNode<Integer> right = takeInput(sc);

        root.right = right;
        root.left = left;

        return root;
    }
}
