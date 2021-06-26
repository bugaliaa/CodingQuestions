package InterviewBit.TreeDataStructure.BSTTraversal;

// https://www.interviewbit.com/problems/valid-bst-from-preorder/
// Valid BST From Preorder

import java.util.*;

public class Problem1 {
    public int solve(ArrayList<Integer> A) {
        Stack<Integer> s = new Stack<>();
        int root = Integer.MIN_VALUE;
        int n = A.size();
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && A.get(i) > s.peek()){
                root = s.peek();
                s.pop();
            }

            if(root > A.get(i)) return 0;

            s.push(A.get(i));
        }

        return 1;
    }
}
