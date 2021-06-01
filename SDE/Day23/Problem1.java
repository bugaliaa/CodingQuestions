package SDE.Day23;

// https://leetcode.com/problems/clone-graph/
// Clone graph

import java.util.*;

public class Problem1 {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node clone(Node node, Map<Integer, Node> map){
        if(node == null) return null;

        if(map.containsKey(node.val)) return map.get(node.val);

        Node newNode = new Node(node.val, new ArrayList<>());
        map.put(newNode.val, newNode);
        for(Node it: node.neighbors){
            newNode.neighbors.add(clone(it, map));
        }
        return newNode;
    }

    public Node cloneGraph(Node node) {
        Map<Integer, Node> map = new HashMap<>();
        return clone(node, map);
    }
}
