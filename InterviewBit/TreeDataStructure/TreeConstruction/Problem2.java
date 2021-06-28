package InterviewBit.TreeDataStructure.TreeConstruction;

// https://www.interviewbit.com/problems/sorted-array-to-balanced-bst/
// Sorted Array to Balanced BST

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
    public TreeNode sortedArrayToBST(final int[] A) {
        return construct(A, 0, A.length);
    }
    public TreeNode construct(final int[] A, int l, int r){
        if(l > r) return null;

        int mid = l + r >> 1;
        int rootData = A[mid];
        TreeNode newNode = new TreeNode(rootData);
        newNode.left = construct(A, l, mid-1);
        newNode.right = construct(A, mid+1, r);

        return newNode;
    }
}
