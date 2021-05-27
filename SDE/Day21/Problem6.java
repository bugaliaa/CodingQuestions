package SDE.Day21;

// https://practice.geeksforgeeks.org/problems/largest-bst/1#
// Largest BST in a BT (GFG)

import SDE.Classes.GFG.Node;

public class Problem6 {
    class bstPair{
        int max;
        int min;
        boolean isBST;
        int size;
        Node root;
    }
    public int largestBST(Node root){
        bstPair ans = helper(root);
        return ans.size;
    }
    public bstPair helper(Node root){
        if(root == null){
            bstPair mp = new bstPair();
            mp.max = Integer.MAX_VALUE;
            mp.min = Integer.MIN_VALUE;
            mp.isBST = true;
            mp.size = 0;
            mp.root = null;
            return mp;
        }

        bstPair leftPair = helper(root.left);
        bstPair rightPair = helper(root.right);

        int min = Math.min(root.data, Math.min(leftPair.min, rightPair.min));
        int max = Math.max(root.data, Math.max(leftPair.max, rightPair.max));
        boolean isBST = root.data >= leftPair.max && root.data <= rightPair.min && leftPair.isBST && rightPair.isBST;

        bstPair output = new bstPair();
        output.max = max;
        output.min = min;
        output.isBST = isBST;

        if(output.isBST){
            output.root = root;
            output.size = leftPair.size + rightPair.size + 1;
        }else if(leftPair.size > rightPair.size){
            output.root = leftPair.root;
            output.size = leftPair.size;
        }else{
            output.root = rightPair.root;
            output.size = rightPair.size;
        }

        return output;
    }
}
