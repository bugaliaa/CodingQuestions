package SDE.Trees;

import SDE.Classes.TreeNode;

public class CountNodes {
    public static void main(String[] args) {
        
    }
    public static int countNodes(TreeNode<Integer> root){
        int ans = 1;
        for(int i = 0; i < root.children.size(); i++){
            ans += countNodes(root.children.get(i));
        }
        return ans;
    }
}
