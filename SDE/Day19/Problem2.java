package SDE.Day19;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// Construct Binary Tree from Preorder and Inorder Traversal (LeetCode)

public class Problem2 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int size = preorder.length;
        return build(preorder, inorder, 0, size-1, 0, size-1);
    }
    public TreeNode build(int[] pre, int[] ino, int pre_start, int pre_end, int ino_start, int ino_end){
        if(ino_start > ino_end) return null;

        int rootData = pre[pre_start];
        int rootIdx = -1;
        for(int i = ino_start; i <= ino_end; i++){
            if(ino[i] == rootData){
                rootIdx = i;
                break;
            }
        }

        int left_ino_start = ino_start;
        int left_ino_end = rootIdx - 1; 
        int left_pre_start = pre_start + 1;
        int left_pre_end = left_ino_end - left_ino_start + left_pre_start;
        int right_ino_start = rootIdx + 1;
        int right_ino_end = ino_end;
        int right_pre_start = left_pre_end + 1;
        int right_pre_end = pre_end;

        TreeNode root = new TreeNode(rootData);
        root.left = build(pre, ino, left_pre_start, left_pre_end, left_ino_start, left_ino_end);
        root.right = build(pre, ino, right_pre_start, right_pre_end, right_ino_start, right_ino_end);

        return root;
    }
}
