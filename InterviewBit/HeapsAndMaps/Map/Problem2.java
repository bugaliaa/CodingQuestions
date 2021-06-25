package InterviewBit.HeapsAndMaps.Map;

// https://www.interviewbit.com/problems/lru-cache/
// LRU Cache

import java.util.*;

public class Problem2 {
    public DLinkedNode head;
    public DLinkedNode tail;
    public Map<Integer, DLinkedNode> map = new HashMap<>();
    public int capacity;

    public Problem2(int capacity) {
        this.capacity = capacity;

        head = new DLinkedNode();
        head.prev = null;
        
        tail = new DLinkedNode();
        tail.next = null;

        head.next = tail;
        tail.prev = head;
    }

    public void addNode(DLinkedNode node){
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    public void removeNode(DLinkedNode node){
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    public void moveToHead(DLinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }

    public DLinkedNode popTail(){
        DLinkedNode res = tail.prev;
        this.removeNode(res);
        return res;
    }
    
    public int get(int key) {
        DLinkedNode node = map.get(key);

        if(node == null) return -1;
        this.moveToHead(node);
        return node.val;
    }
    
    public void set(int key, int value) {
        DLinkedNode node = map.get(key);

        if(node == null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.val = value;

            this.map.put(key, newNode);
            this.addNode(newNode);

            if(map.size() > capacity){
                DLinkedNode res = this.popTail();
                this.map.remove(res.key);
            }
        }else{
            node.val = value;
            this.moveToHead(node);
        }
    }

    class DLinkedNode{
        int key;
        int val;
        DLinkedNode prev;
        DLinkedNode next;
    }
}
