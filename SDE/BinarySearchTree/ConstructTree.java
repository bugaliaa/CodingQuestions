package SDE.BinarySearchTree;

import SDE.Classes.LeetCode.TreeNode;

public class ConstructTree {
    public TreeNode constructTree(int[] a){
        return construct(a, 0, a.length);
    }
    public TreeNode construct(int[] a, int l, int r){
        if(l > r) return null;

        int mid = (l+r)/2;
        int rootData = a[mid];
        TreeNode root = new TreeNode(rootData);
        root.left = construct(a, l, mid-1);
        root.right = construct(a, mid+1, r);

        return root;
    }
}
