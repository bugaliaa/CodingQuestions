package InterviewBit.LinkedList.List2Pointer;

// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/
// Remove Duplicates from sorted list

public class Problem4 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode deleteDuplicates(ListNode A) {
        ListNode curr = A;

        while(curr != null){
            ListNode temp = curr;
            while(temp != null && temp.val == curr.val) temp = temp.next;
            curr.next = temp;
            curr = curr.next;
        }

        return A;
    }
}
