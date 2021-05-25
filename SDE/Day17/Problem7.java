package SDE.Day17;

// https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1
// Vertical Order Traversal of Binary Tree (GFG)

import java.util.*;

import SDE.Classes.GFG.Node;

public class Problem7 {
    public static class vPair{
        Node node = null;
        int hl = 0;
        vPair(Node node, int hl){
            this.node = node;
            this.hl = hl;
        }
    }
    public static ArrayList<Integer> verticalOrder(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<vPair> q = new LinkedList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        int minHL = 0;
        int maxHL = 0;

        q.add(new vPair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                vPair rp = q.poll();

                maxHL = Math.max(maxHL, rp.hl);
                minHL = Math.min(minHL, rp.hl);
                
                map.putIfAbsent(rp.hl, new ArrayList<>());
                map.get(rp.hl).add(rp.node.data);

                if(rp.node.left != null){
                    q.add(new vPair(rp.node.left, rp.hl-1));
                }
                if(rp.node.right != null){
                    q.add(new vPair(rp.node.right, rp.hl+1));
                }
            }
        }

        for(int i = minHL; i <= maxHL; i++){
            List<Integer> temp = map.get(i);
            for(int j: temp) list.add(j);
        }

        return list;
    }    
}
