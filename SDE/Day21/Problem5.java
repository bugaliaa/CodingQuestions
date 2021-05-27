package SDE.Day21;

import java.util.Stack;

import SDE.Classes.LeetCode.TreeNode;

// https://leetcode.com/problems/binary-search-tree-iterator/
// BST Iterator (LeetCode)

public class Problem5 {
    class BSTIterator {

        TreeNode node;
        Stack<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            node = root;
            stack = new Stack<>();
        }
        
        public int next() {
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            int res = node.val;
            node = node.right;
            return res;
        }
        
        public boolean hasNext() {
            return !stack.isEmpty() || node != null;
        }
    }
}
