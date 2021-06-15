package InterviewBit.LinkedList.List2Pointer;

// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list-ii/
// Remove Duplicates from sorted list ii

public class Problem2 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode deleteDuplicates(ListNode A) {
        ListNode dummy = new ListNode(0);

        dummy.next = A;
        ListNode prev = dummy;
        ListNode curr = A;

        while(curr != null){
            while(curr.next != null && prev.next.val == curr.next.val) curr = curr.next;

            if(prev.next == curr) prev = prev.next;
            else prev.next = curr.next;

            curr = curr.next;
        }

        return dummy.next;
    }
}
