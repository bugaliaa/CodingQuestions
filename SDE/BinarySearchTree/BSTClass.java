package SDE.BinarySearchTree;

import SDE.Classes.LeetCode.TreeNode;

public class BSTClass {
    private TreeNode root;
    BSTClass(){
        root = null;
    }
    
    public void delete(int data){
        this.root = delete(this.root, data);
    }
    private TreeNode delete(TreeNode node, int data){
        if(node == null) return null;
        if(data > node.val){
            TreeNode temp = node.right;
            node.right = delete(node.right, data);
            return temp;
        }else if(data <= node.val){
            TreeNode temp = node.left;
            node.left = delete(node.left, data);
            return temp;
        }else{
            if(node.left == null && node.right == null) return null;
            if(node.left == null) return node.right;
            if(node.right == null) return node.left;
            TreeNode minNode = node.right;
            while(minNode.left != null){
                minNode = minNode.left;
            }
            int rightMin = minNode.val;
            node.val = rightMin;
            node.right = delete(node.right, rightMin);
            return node;
        }
    }
    public void insert(int data){
        this.root = insert(this.root, data);
    }
    private TreeNode insert(TreeNode node, int data){
        if(node == null){
            TreeNode newNode = new TreeNode(data);
            return newNode;
        }
        if(data < node.val){
            node.left = insert(node.left, data);
        }else{
            node.right = insert(node.right, data);
        }
        return node;
    }
    public boolean contains(int data){
        return contains(data, root); 
    }
    private boolean contains(int data, TreeNode node){
        if(node == null) return false;
        if(node.val == data) return true;
        else if(node.val > data) return contains(data, node.left);
        return contains(data, node.right);
    }
    public void printTree(){
        printTree(this.root);
    }
    private void printTree(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + ": ");
        if(root.left != null) System.out.print("L" + root.left.val);
        if(root.right != null) System.out.print(" R" + root.right.val);
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
}
