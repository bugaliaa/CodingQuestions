package SDE.Day21;

// Floor and Ceil of a BST ()

import java.util.*;

import SDE.Classes.LeetCode.TreeNode;

public class Problem1 {
    public List<Integer> floorCeil(TreeNode root, int key){
        List<Integer> list = new ArrayList<>();
        list.add(floor(root, key));
        list.add(ceil(root, key));
        return list;
    }
    public int floor(TreeNode root, int key){
        if(root == null) return -1;
        if(root.val == key) return root.val;
        if(root.val < key) return floor(root.right, key);
        
        int f = floor(root.left, key);
        return f <= key ? f : root.val; 
    }
    public int ceil(TreeNode root, int key){
        if(root == null) return -1;
        if(root.val == key) return root.val;
        if(root.val < key) return ceil(root.right, key);

        int c = ceil(root.left, key);
        return c >= key ? c : root.val;
    }
}
