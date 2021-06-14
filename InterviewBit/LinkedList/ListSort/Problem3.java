package InterviewBit.LinkedList.ListSort;

// https://www.interviewbit.com/problems/insertion-sort-list/
// Insertion Sort List

public class Problem3 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode insertionSortList(ListNode A) {
        ListNode start = new ListNode(0);
        ListNode head = A;
        start.next = head;

        ListNode i = head;
        ListNode prev = start;

        while(i != null){
            if(i.next != null && (i.val > i.next.val)){
                while(prev.next != null && (prev.next.val < i.next.val)) prev = prev.next;

                ListNode temp = prev.next;
                prev.next = i.next;
                i.next = i.next.next;
                prev.next.next = temp;
                prev = start;
            }else i = i.next;
        }

        return start.next;
    }
}
