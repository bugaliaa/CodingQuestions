package InterviewBit.TreeDataStructure.LevelOrder;

// https://www.interviewbit.com/problems/cousins-in-binary-tree/
// Cousins in Binary Tree

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
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        if(A == null || A.val == B) return list;

        Queue<TreeNode> q = new LinkedList<>();
        boolean find = false;
        q.add(A);

        while(!q.isEmpty() && !find){
            int size = q.size();
            while(size-- > 0){
                TreeNode node = q.poll();

                if((node.left != null && node.left.val == B) || (node.right != null && node.right.val == B)){
                    find = true;
                }else{
                    if(node.left != null) q.add(node.left);
                    if(node.right != null) q.add(node.right);
                }
            }
        }

        if(find){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                list.add(q.poll().val);
            }
        }

        return list;
    }
}
