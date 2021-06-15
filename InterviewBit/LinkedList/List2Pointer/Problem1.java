package InterviewBit.LinkedList.List2Pointer;

// https://www.interviewbit.com/problems/palindrome-list/
// Palindrome List

public class Problem1 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public int lPalin(ListNode A) {
        if(A == null || A.next == null) return 1;

        ListNode slow = A;
        ListNode fast = A;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);

        slow = slow.next;

        while(slow != null){
            if(A.val != slow.val) return 0;

            A = A.next;
            slow = slow.next;
        }

        return 1;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
