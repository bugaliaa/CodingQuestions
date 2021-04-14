package SDE.Day5;

// https://leetcode.com/problems/merge-two-sorted-lists/
// Merge Two Sorted Lists

public class Problem3 {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){ }
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
    public static void main(String[] args) {
        
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val > l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode res = l1;
        while(l1 != null && l2 != null){
            ListNode temp = null;
            while(l1 != null && l1.val <= l2.val){
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l2;

            ListNode tmp = l2;
            l2 = l1;
            l1 = tmp;
        }
        return res;
    }
}
