package SDE.Day5;

// https://leetcode.com/problems/add-two-numbers
// Add Two Numbers

import SDE.Classes.ListNode;

public class Problem6 {
    public static void main(String[] args) {
        
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        return ans.next;
    }
}
