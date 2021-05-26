package SDE.Day19;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
// Construct a Binary Tree from inorder and postorder traversal (LeetCode)

public class Problem3 {
    public static void main(String[] args) {
        Problem3 p = new Problem3();
        int inorder[] = {9,3,15,20,7};
        int postorder[] = {9,15,7,20,3};
        TreeNode root = p.buildTree(inorder, postorder);
        System.out.println(root);
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int size = inorder.length;
        return build(inorder, postorder, 0, size-1, 0, size-1);
    }
    public TreeNode build(int[] ino, int[] post, int ino_start, int ino_end, int post_start, int post_end){
        if(ino_start > ino_end) return null;

        int rootData = post[post_end];
        int rootIdx = -1;

        for(int i = ino_start; i <= ino_end; i++){
            if(ino[i] == rootData){
                rootIdx = i;
                break;
            }
        }

        int left_ino_start = ino_start;
        int left_ino_end = rootIdx - 1;
        int left_post_start = post_start;
        int left_post_end = left_post_start - ino_start + rootIdx - 1;
        
        int right_ino_start = rootIdx + 1;
        int right_ino_end = ino_end;
        int right_post_start = left_post_end + 1;
        int right_post_end = post_end-1;

        TreeNode root = new TreeNode(rootData);
        root.left = build(ino, post, left_ino_start, left_ino_end, left_post_start, left_post_end);
        root.right = build(ino, post, right_ino_start, right_ino_end, right_post_start, right_post_end);

        return root;
    }
}
