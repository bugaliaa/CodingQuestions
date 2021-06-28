package InterviewBit.TreeDataStructure.BSTTraversal;

// https://www.interviewbit.com/problems/recover-binary-search-tree/
// Recover Binary Search Tree

import java.util.*;

public class Problem5 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    TreeNode first, last, prev;
    public ArrayList<Integer> recoverTree(TreeNode A) {
        first = last = prev = null;

        MorrisTraversal(A);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(last.val);
        list.add(first.val);

        return list;
    }
    public void MorrisTraversal(TreeNode A){
        TreeNode curr = A;
        TreeNode pre = null;

        while(curr != null){
            if(curr.left == null){
                if(first == null && prev != null && prev.val > curr.val){
                    first = prev;
                    last = curr;
                }
                if(first != null && prev.val > curr.val){
                    last = curr;
                }
                prev = curr;
                curr = curr.right;
            }else{
                pre = curr.left;

                while(pre.right != null && pre.right != curr){
                    pre = pre.right;
                }

                if(pre.right == null){
                    pre.right = curr;
                    curr = curr.left;
                }else{
                    if(first == null && prev != null && prev.val > curr.val){
                        first = prev;
                        last = curr;
                    }

                    if(first != null && prev.val > curr.val){
                        last = curr;
                    }

                    prev = curr;

                    pre.right = null;
                    curr = curr.right;
                }
            }
        }
    }
}
