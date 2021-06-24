package InterviewBit.HeapsAndMaps.Heap;

// https://www.interviewbit.com/problems/merge-k-sorted-lists/
// Merge K Sorted Lists

import java.util.*;

public class Problem7 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){this.val = x; next = null;}
    }
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
            @Override public int compare(ListNode l1, ListNode l2){
                return l1.val - l2.val;
            }
        });

        ListNode head = new ListNode(0);
        ListNode tail = head;
        for(ListNode node: a){
            if(node != null) pq.add(node);
        }

        while(!pq.isEmpty()){
            tail.next = pq.poll();
            tail = tail.next;
            if(tail.next != null) pq.add(tail.next);
        }

        return head.next;
	}
}
