package SDE.Trees;

import java.util.*;
import SDE.Classes.TreeNode;

public class Traversals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
        sc.close();
        postorder(root);
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
    public static void preorder(TreeNode<Integer> root){
        if(root == null) return;
        System.out.print(root.data + " ");
        for(int i = 0; i < root.children.size(); i++){
            preorder(root.children.get(i));
        }
    }
    public static void postorder(TreeNode<Integer> root){
        if(root == null) return;
        for(int i = 0; i < root.children.size(); i++){
            postorder(root.children.get(i));
        }
        System.out.print(root.data + " ");
    }
}
