package SDE.Classes;

import java.util.*;

public class TreeNode<T> {
    public T data;
    public List<TreeNode<T>> children = new ArrayList<>();

    public TreeNode(T data){
        this.data = data;
    }
    public TreeNode(){
        
    }
}
