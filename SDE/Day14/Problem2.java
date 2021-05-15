package SDE.Day14;

// https://leetcode.com/problems/lru-cache/
// LRU Cache implementation (LeetCode)

import java.util.*;

public class Problem2 {

    private DLinkedNode head;
    private DLinkedNode tail;
    private HashMap<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    private int capacity;

    class DLinkedNode{
        int key;
        int value;
        DLinkedNode next;
        DLinkedNode prev;
    }
    
    private void addNode(DLinkedNode node){
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node){
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void moveToHead(DLinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }

    private DLinkedNode popTail(){
        DLinkedNode res = tail.prev;
        this.removeNode(res);
        return res;
    }

    // public LRUCache(int capacity)
    public Problem2(int capacity) {
        this.capacity = capacity;

        head = new DLinkedNode();
        head.prev = null;

        tail = new DLinkedNode();
        tail.next = null;

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if(node == null) return -1;
        this.moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);

        if(node == null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;

            this.cache.put(key, newNode);
            this.addNode(newNode);

            if(this.cache.size() > capacity){
                DLinkedNode res = this.popTail();
                this.cache.remove(res.key);
            }
        }else{
            node.value = value;
            this.moveToHead(node);
        }
    }
}
