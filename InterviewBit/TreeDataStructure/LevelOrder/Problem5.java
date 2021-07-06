package InterviewBit.TreeDataStructure.LevelOrder;

// https://www.interviewbit.com/problems/populate-next-right-pointers-tree/
// Populate Next Right Pointers Tree

public class Problem5 {
    class TreeLinkNode{
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int val){this.val = val;}
    }
    public void connect(TreeLinkNode root) {
        if(root == null) return;

        root.next = null;

        while(root != null){
            TreeLinkNode curr = root;
            while(curr != null){
                if(curr.left != null){
                    if(curr.right != null){
                        curr.left.next = curr.right;
                    }else{
                        curr.left.next = getRight(curr);
                    }
                }

                if(curr.right != null){
                    curr.right.next = getRight(curr);
                }

                curr = curr.next;
            }

            if(root.left != null) root = root.left;
            else if(root.right != null) root = root.right;
            else root = getRight(root);
        }
    }
    public TreeLinkNode getRight(TreeLinkNode root){
        TreeLinkNode temp = root.next;
        while(temp != null){
            if(temp.left != null) return temp.left;
            if(temp.right != null) return temp.right;
            temp = temp.next;
        }
        return null;
    }
}
