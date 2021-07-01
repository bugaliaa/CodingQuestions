package InterviewBit.TreeDataStructure.RootToLeaf;

// https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/
// Root to Leaf Paths with sum

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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        helper(A, B, 0, list, new ArrayList<>());
        return list;
    }
    public void helper(TreeNode A, int B, int sum, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp){
        if(A == null) return;

        sum = sum+A.val;
        temp.add(A.val);

        if(sum == B){
            list.add(new ArrayList<>(temp));
        }

        if(A.left != null) helper(A.left, B, sum, list, temp);
        if(A.right != null) helper(A.right, B, sum, list, temp);

        temp.remove(temp.size()-1);
    }
}
