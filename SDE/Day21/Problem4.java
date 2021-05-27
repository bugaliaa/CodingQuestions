package SDE.Day21;

import SDE.Classes.LeetCode.TreeNode;
import java.util.*;

// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
// Find a pair with given sum in bst (LeetCode)

public class Problem4 {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int start = 0;
        int end = list.size()-1;
        while(start < end){
            int sum = list.get(start) + list.get(end);
            if(sum == k) return true;
            else if(sum < k) start++;
            else end--;
        }
        return false;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
