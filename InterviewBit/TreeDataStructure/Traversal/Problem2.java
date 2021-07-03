package InterviewBit.TreeDataStructure.Traversal;

// https://www.interviewbit.com/problems/diagonal-traversal/
// Diagonal Traversal

import java.util.*;

public class Problem2 {
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
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        helper(A, 0, map);
        for(Map.Entry<Integer, List<Integer>> e: map.entrySet()){
            for(int i: e.getValue()) list.add(i);
        }
        return list;
    }
    public void helper(TreeNode A, int d, Map<Integer, List<Integer>> map){
        if(A == null) return;

        List<Integer> temp = map.get(d);

        if(temp == null){
            temp = new ArrayList<>();
            temp.add(A.val);
        }else{
            temp.add(A.val);
        }

        map.put(d, temp);

        helper(A.left, d+1, map);
        helper(A.right, d, map);
    }
}
