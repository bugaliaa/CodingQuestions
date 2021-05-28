package SDE.Day21;

// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
// Serialixe and Deserialixe a Binary Tree (LeetCode)

import SDE.Classes.LeetCode.TreeNode;
import java.util.*;

public class Problem8 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "X" + ",";

        String leftSubTree = serialize(root.left);
        String rightSubTree = serialize(root.right);

        return root.val + "," + leftSubTree + rightSubTree;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodesLeft = new LinkedList<>();
        nodesLeft.addAll(Arrays.asList(data.split(",")));
        return deserializeHelper(nodesLeft);
    }
    public TreeNode deserializeHelper(Queue<String> nodesLeft){
        String s = nodesLeft.poll();
        if(s.equals("X")){
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = deserializeHelper(nodesLeft);
        root.right = deserializeHelper(nodesLeft);

        return root;
    }
}
