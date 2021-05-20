package SDE.Trees;

import SDE.Classes.TreeNode;
import java.util.*;

public class HeightOFTree {
    public static void main(String[] args) {
        HeightOFTree t = new HeightOFTree();
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
        int ans = t.height(root);
        System.out.println(ans);
    }
    public int height(TreeNode<Integer> root){
        int height = 1;
        for(int i = 0; i < root.children.size(); i++){
            height = Math.max(height, height(root.children.get(i)));
        }
        return height+1;
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
}
