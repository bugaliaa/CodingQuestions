package SDE.Trees;

import SDE.Classes.TreeNode;
import java.util.*;

public class Tree1 {
    public static void main(String[] args) {
        // TreeNode<Integer> root = new TreeNode<Integer>(1);
        // TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        // TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        // root.children.add(node1);
        // root.children.add(node2);
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
        sc.close();
        printTree(root);
    }

    public static void printTree(TreeNode<Integer> root){
        System.out.print(root.data + " : ");
        for(int i = 0; i < root.children.size(); i++){
            System.out.print(root.children.get(i).data + " ");
        }
        System.out.println();
        for(int i = 0; i < root.children.size(); i++){
            printTree(root.children.get(i));
        }
    }
    
    public static TreeNode<Integer> takeInput(Scanner sc){
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        System.out.print("Enter number of children for " + data);
        System.out.println();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }
        return root;
    }
}
