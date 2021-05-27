package SDE.Day20;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
// Construct BsT from preorder traversal (LeetCode)

public class Problem3 {
    public static void main(String[] args) {
        Problem3 p = new Problem3();
        int[] preorder = {8,5,1,7,10,12};
        TreeNode root = p.bstFromPreorder(preorder);
        System.out.println(root);
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, 0, preorder.length-1);
    }
    public TreeNode construct(int[] pre, int start, int end){
        if(start > end) return null;
        int rootData = pre[start];
        TreeNode root = new TreeNode(rootData);
        if(start == end) return root;
        int rightStart = -1;
        for(int i = start; i <= end; i++){
            if(pre[i] > rootData){
                rightStart = i;
                break;
            }
        }
        int rightEnd = end;
        int leftStart = start+1;
        int leftEnd = rightStart != -1 ? rightStart-1 : end;
        
        root.left = construct(pre, leftStart, leftEnd);
        if(rightStart != -1) root.right = construct(pre, rightStart, rightEnd);

        return root;
    }
}
