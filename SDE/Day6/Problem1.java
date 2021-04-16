package SDE.Day6;

// https://leetcode.com/problems/intersection-of-two-linked-lists
// Intersection of two Linked Lists

public class Problem1 {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){ } 
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
    public static void main(String[] args) {
        
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int countA = 0;
        while(tempA != null){
            countA++;
            tempA = tempA.next;
        }
        int countB = 0;
        while(tempB != null){
            countB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        while(countA > countB){
            tempA = tempA.next;
            countA--;
        }
        while(countB > countA){
            tempB = tempB.next;
            countB--;
        }
        while(tempA != null && tempB != null){
            if(tempA == tempB) return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}
