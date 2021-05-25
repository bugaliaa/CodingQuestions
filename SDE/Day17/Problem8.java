package SDE.Day17;

// https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
// Top view of Binary Tree (GFG)

import SDE.Classes.GFG.Node;
import java.util.*;

public class Problem8 {
    static class vPair{
        Node node;
        int hl = 0;
        vPair(Node node, int hl){
            this.node = node;
            this.hl = hl;
        }
    }
    static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return null;

        Map<Integer, Integer> map = new HashMap<>();
        Queue<vPair> q = new LinkedList<>();
        int minHL = 0;
        int maxHL = 0;

        q.add(new vPair(root, 0));

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                vPair rp = q.poll();
                
                minHL = Math.min(minHL, rp.hl);
                maxHL = Math.max(maxHL, rp.hl);

                map.putIfAbsent(rp.hl, rp.node.data);

                if(rp.node.left != null){
                    q.add(new vPair(rp.node.left, rp.hl-1));
                }
                if(rp.node.right != null){
                    q.add(new vPair(rp.node.right, rp.hl+1));
                }
            }
        }

        for(int i = minHL; i <= maxHL; i++){
            list.add(map.get(i));
        }

        return list;
    }
}
