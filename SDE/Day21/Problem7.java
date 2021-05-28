package SDE.Day21;

// https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/
// Maximum Sub BST in Binary Tree (LeetCode)

import SDE.Classes.LeetCode.TreeNode;

public class Problem7 {
    class bst{
        int min;
        int max;
        int sum;
        boolean isBST;
        public bst(int min, int max, int sum, boolean isBST){
            this.min = min;
            this.max = max;
            this.sum = sum;
            this.isBST = isBST;
        }
    }
    public int maxSumBST(TreeNode root) {
        int maxSum[] = {0};
        helper(root, maxSum);
        return maxSum[0];
    }
    public bst helper(TreeNode node, int[] maxSum){
        if(node == null){
            return new bst(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        }

        bst left = helper(node.left, maxSum);
        bst right = helper(node.right, maxSum);

        boolean isBST = node.val >= left.max && node.val <= right.min && left.isBST && right.isBST;
        int sum = node.val + left.sum + right.sum;
        
        if(isBST) maxSum[0] = Math.max(maxSum[0], sum);

        int min = Math.min(node.val, left.min);
        int max = Math.max(node.val, right.max);

        return new bst(min, max, sum, isBST);
    }
}
