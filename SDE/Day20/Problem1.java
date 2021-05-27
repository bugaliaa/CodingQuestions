package SDE.Day20;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// Populating next right pointers in each node (LeetCode)

public class Problem1 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        Node levelStart = root;
        while(levelStart != null){
            Node cur = levelStart;
            while(cur != null){
                if(cur.left != null) cur.left.next = cur.right;
                if(cur.right != null && cur.next != null) cur.right.next = cur.next.left;
                cur = cur.next;
            }
            levelStart = levelStart.left;
        }
        return root;
    }    
}
