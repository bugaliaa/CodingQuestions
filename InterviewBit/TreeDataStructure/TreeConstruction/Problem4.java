package InterviewBit.TreeDataStructure.TreeConstruction;

// https://www.interviewbit.com/problems/binary-tree-from-inorder-and-postorder/
// Binary Tree from Inorder and PostOrder

import java.util.*;

public class Problem4 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
        int size = inorder.size();
        return build(inorder, postorder, 0, size-1, 0, size-1);
    }
    public TreeNode build(ArrayList<Integer> ino, ArrayList<Integer> post, int ino_start, int ino_end, int post_start, int post_end){
        if(ino_start > ino_end) return null;

        int rootData = post.get(post_end);
        int rootIdx = -1;

        for(int i = ino_start; i <= ino_end; i++){
            if(rootData == ino.get(i)){
                rootIdx = i;
                break;
            }
        }

        int left_ino_start = ino_start;
        int left_ino_end = rootIdx-1;
        int left_post_start = post_start;
        int left_post_end = left_post_start - ino_start + rootIdx - 1;

        int right_ino_start = rootIdx+1;
        int right_ino_end = ino_end;
        int right_post_start = left_post_end+1;
        int right_post_end = post_end-1;

        TreeNode root = new TreeNode(rootData);
        root.left = build(ino, post, left_ino_start, left_ino_end, left_post_start, left_post_end);
        root.right = build(ino, post, right_ino_start, right_ino_end, right_post_start, right_post_end);

        return root;
    }
}
