package SDE.BinarySearchTree;

import java.util.*;
import SDE.Classes.LeetCode.TreeNode;

public class RootToPath {
    public List<Integer> rootToPath(TreeNode root, int data){
        if(root == null) return null;

        if(root.val == data){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            return list;
        }

        List<Integer> left = rootToPath(root.left, data);
        if(left != null){
            left.add(root.val);
            return left;
        }
        List<Integer> right = rootToPath(root.right, data);
        if(right != null){
            right.add(root.val);
            return right;
        }
        return null;
    }
}
