package SDE.BinaryTree;

import SDE.Classes.BinaryTreeNode;
import java.util.*;

public class Traversals {
    // 1 2 3 4 5 6 7 -1 -1 -1 -1 8 9 -1 -1 -1 -1 -1 -1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        sc.close();
        System.out.println();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }

    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.print("Enter data: ");
        int rootData = sc.nextInt();
        
        if(rootData == -1) return null;
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.add(root);
        
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            
            System.out.print("Enter left child of  " + front.data + ": ");
            int leftChildData = sc.nextInt();
            
            if(leftChildData != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                front.left = leftChild;
                pendingNodes.add(leftChild);
            }
            
            System.out.print("Enter right child of " + front.data + ": ");
            int rightChildData = sc.nextInt();
            
            if(rightChildData != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                front.right = rightChild;
                pendingNodes.add(rightChild);
            }
        }

        return root;
    }

    public static void inorder(BinaryTreeNode<Integer> root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(BinaryTreeNode<Integer> root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(BinaryTreeNode<Integer> root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}
