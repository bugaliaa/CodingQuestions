package SDE.Trees;

import SDE.Classes.TreeNode;

public class PrintNodesAtLevelK {
    public void printAtLevelK(TreeNode<Integer> root, int k){
        if(root == null) return;
        if(k == 0){
            System.out.println(root.data + " ");
            return;
        }
        for(int i = 0; i < root.children.size(); i++){
            printAtLevelK(root.children.get(i), k-1);
        }
    }
}
