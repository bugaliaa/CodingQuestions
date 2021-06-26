package InterviewBit.TreeDataStructure.BSTTraversal;

// https://www.interviewbit.com/problems/2sum-binary-tree/
// 2 Sum Binary Tree

import java.util.*;

public class Problem3 {
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
    public int t2Sum(TreeNode A, int B) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        boolean d1 = false;
        boolean d2 = false;
        int val1 = 0;
        int val2 = 0;
        TreeNode curr1 = A;
        TreeNode curr2 = A;

        while(true){
            while(!d1){
                if(curr1 != null){
                    s1.push(curr1);
                    curr1 = curr1.left;
                }else{
                    if(s1.isEmpty()) d1 = true;
                    else{
                        curr1 = s1.pop();
                        val1 = curr1.val;
                        curr1 = curr1.right;
                        d1 = true;
                    }
                }
            }

            while(!d2){
                if(curr2 != null){
                    s2.push(curr2);
                    curr2 = curr2.right;
                }else{
                    if(s2.isEmpty()) d2 = true;
                    else{
                        curr2 = s2.pop();
                        val2 = curr2.val;
                        curr2 = curr2.left;
                        d2 = true;
                    }
                }
            }

            if((val1 != val2) && (val1 + val2 == B)) return 1;
            else if(val1 + val2 < B) d1 = false;
            else if(val1 + val2 > B) d2 = false;

            if(val1 >= val2) return 0;
        }
    }
}
