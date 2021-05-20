package SDE.Trees;

import SDE.Classes.TreeNode;
import java.util.*;

// Tree level order insertion and printing

public class Tree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
        sc.close();
        printTree(root);
    }
    public static TreeNode<Integer> takeInput(Scanner sc){
        Queue<TreeNode<Integer>> pendindNodes = new LinkedList<>();
        System.out.print("Enter Root data: ");
        int rootData = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendindNodes.add(root);
        while(!pendindNodes.isEmpty()){
            TreeNode<Integer> front = pendindNodes.poll();
            System.out.print("Enter Number of Children of " + front.data + ": ");
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                System.out.print("Enter " + i + "th child of " + front.data + ": ");
                int data = sc.nextInt();
                TreeNode<Integer> node = new TreeNode<>(data);
                front.children.add(node);
                pendindNodes.add(node);
            }
        }
        return root;
    }
    public static void printTree(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> node = pendingNodes.poll();
            System.out.print(node.data + ": ");
            for(int i = 0; i < node.children.size(); i++){
                TreeNode<Integer> temp = node.children.get(i);
                pendingNodes.add(temp);
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }
    }
}
