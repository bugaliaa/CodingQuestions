package SDE.Day17;

// https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
// Bottom View of Binary Tree (GFG)

import java.util.*;

class Node{
    int data;
    int hd;
    Node left, right;

    public Node(int key){
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}

public class Problem6 {
    public ArrayList<Integer> bottomView(Node root){
        if(root == null) return null;

        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();

        int hd = 0;

        root.hd = hd;
        q.add(root);

        while(!q.isEmpty()){
            Node temp = q.poll();
            hd = temp.hd;
            map.put(hd, temp.data);

            if(temp.left != null){
                q.add(temp.left);
                temp.left.hd = hd-1;
            }
            if(temp.right != null){
                q.add(temp.right);
                temp.right.hd = hd+1;
            }
        }

        for(int i: map.values()){
            list.add(i);
        }

        return list;
    }
    
}
