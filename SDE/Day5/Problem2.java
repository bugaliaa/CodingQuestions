package SDE.Day5;

import SDE.Day5.Problem1.ListNode;

//https://leetcode.com/problems/middle-of-the-linked-list
//Middle of a linked list

public class Problem2 {
    public static void main(String[] args) {
        
    }
    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        if(c%2 == 0){
            c = (c/2)+1;
        }else c = c/2;
        temp = head;
        int k = 0;
        while(k < c){
            k++;
            temp = temp.next;
        }
        return temp;
    }
}
