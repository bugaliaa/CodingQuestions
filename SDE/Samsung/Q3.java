package SDE.Samsung;

import SDE.Classes.ListNode;

public class Q3 {
    public static void main(String[] args) {
        
    }
    public static ListNode func(ListNode head1, ListNode head2){
        if(head1 == null) return null;
        if(head2 == null) return head1;

        head1 = reverse(head1);
        head2 = reverse(head2);

        ListNode temp1 = head1;
        ListNode temp2 = head2;

        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        int borrow = 0;
        while(temp1 != null){
            int diff = borrow + temp1.val - (temp2 != null ? temp2.val : 0);
            if(diff < 0){
                borrow = -1;
                diff += 10;
            }else borrow = 0;
            temp.next = new ListNode(diff);
            temp = temp.next;
            temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }

        return reverse(ans.next);

    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head;

        while(next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
