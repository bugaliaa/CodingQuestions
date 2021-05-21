package SDE.Classes;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(){

    }
    public BinaryTreeNode(T data){
        this.data = data;
        left = null;
        right = null;
    }
}
