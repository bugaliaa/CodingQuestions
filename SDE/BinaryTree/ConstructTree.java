package SDE.BinaryTree;

import SDE.Classes.BinaryTreeNode;

public class ConstructTree {
    public static void main(String[] args) {
        int ino[] = {4, 2, 5, 1, 8, 6, 9, 3, 7};
        int pre[] = {1, 2, 4, 5, 3, 6, 8, 9, 7};
        BinaryTreeNode<Integer> root = construct(pre, ino, ino.length);
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
        System.out.print("Preorder: ");
        preorder(root);
    }
    public static void inorder(BinaryTreeNode<Integer> root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(BinaryTreeNode<Integer> root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static BinaryTreeNode<Integer> construct(int[] pre, int[] ino, int size){
        return constructHelper(ino, pre, 0, size-1, 0, size-1);
    }
    public static BinaryTreeNode<Integer> constructHelper(int[] ino, int[] pre, int ino_start, int ino_end, int pre_start, int pre_end){
        if(ino_start > ino_end) return null;
        
        int rootData = pre[pre_start];
        int rootIndex = -1;
        for(int i = ino_start; i <= ino_end; i++){
            if(ino[i] == rootData){
                rootIndex = i;
                break;
            }
        }
        int left_ino_start = ino_start;
        int left_ino_end = rootIndex-1;
        int left_pre_start = pre_start+1;
        int left_pre_end = left_ino_end - left_ino_start + left_pre_start;
        int right_pre_start = left_pre_end+1;
        int right_pre_end = pre_end;
        int right_ino_start = rootIndex + 1;
        int right_ino_end = ino_end;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        root.left = constructHelper(ino, pre, left_ino_start, left_ino_end, left_pre_start, left_pre_end);
        root.right = constructHelper(ino, pre, right_ino_start, right_ino_end, right_pre_start, right_pre_end);

        return root ;
    }
}
