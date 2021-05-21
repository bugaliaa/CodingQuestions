package SDE.Trees;

import SDE.Classes.TreeNode;
import java.util.*;

public class CountLeafNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
        sc.close();
        System.out.println(countLeafNodes(root));
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
    public static int countLeafNodes(TreeNode<Integer> root){
        if(root.children == null || root.children.size() == 0) return 1;
        int ans = 0;
        for(int i = 0; i < root.children.size(); i++){
            ans += countLeafNodes(root.children.get(i));
        }
        return ans;
    }
}
