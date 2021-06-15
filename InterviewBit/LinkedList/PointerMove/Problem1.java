package InterviewBit.LinkedList.PointerMove;

// https://www.interviewbit.com/problems/k-reverse-linked-list/
// K Reverse Linked List

public class Problem1 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode reverseList(ListNode A, int B) {
        if(A == null || B == 1) return A;

        ListNode dummy = new ListNode(0);
        dummy.next = A;

        ListNode pre = dummy, cur = dummy, next = dummy;

        int count = 0;
        while(cur.next != null){
            cur = cur.next;
            count++;
        }

        while(count >= B){
            cur = pre.next;
            next = cur.next;

            for(int i = 1; i < B; i++){
                cur.next = next.next;
                next.next = pre.next;
                pre.next = next;
                next = cur.next;
            }
            pre = cur;
            count -= B;
        }

        return dummy.next;
    }
}
