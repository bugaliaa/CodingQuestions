package SDE.BinaryTree;

import SDE.Classes.BinaryTreeNode;
import java.util.*;

public class BinaryTree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        sc.close();
        printTree(root);
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

    public static void printTree(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendindNodes = new LinkedList<>();
        pendindNodes.add(root);
        while(!pendindNodes.isEmpty()){
            BinaryTreeNode<Integer> node = pendindNodes.poll();
            System.out.print(node.data + ": ");
            if(node.left != null){
                BinaryTreeNode<Integer> left = node.left;
                System.out.print("L" + left.data);
                pendindNodes.add(left);
            }
            if(node.right != null){
                BinaryTreeNode<Integer> right = node.right;
                System.out.print(" R" + right.data);
                pendindNodes.add(right);
            }
            System.out.println();
        }
    }
}
