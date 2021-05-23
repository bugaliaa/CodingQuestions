package SDE.Day17;

// https://leetcode.com/problems/binary-tree-right-side-view/
// Left View of Binary Tree/Right View variation (LeetCode)

import java.util.*;
import SDE.Classes.LeetCode.TreeNode;

public class Problem5 {
    public List<Integer> leftSideView(TreeNode root){
        List<Integer> list = new ArrayList<>();
        leftView(root, list, 0);
        return list;
    }
    public void leftView(TreeNode root, List<Integer> list, int currDepth){
        if(root == null) return;

        if(currDepth == list.size()) list.add(root.val);

        leftView(root.left, list, currDepth+1);
        leftView(root.right, list, currDepth+1);
    }
}
