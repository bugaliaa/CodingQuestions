package InterviewBit.LinkedList.ListTrick;

// https://www.interviewbit.com/problems/reverse-link-list-ii/
// Reverse Link List II

public class Problem3 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(A == null) return null;
        if(A.next == null) return A;

        ListNode first = null;
        ListNode last = null;
        ListNode prev = null;
        ListNode curr = null;

        curr = A;
        int n = 1;

        while(n < B){
            prev = curr;
            curr = curr.next;
            n++;
        }

        if(curr != null) first = curr;

        for(int i = 1; i <= C-B+1 && curr != null; i++){
            ListNode temp = curr.next;
            curr.next = last;
            last = curr;
            curr = temp;
        }

        if(prev != null) prev.next = last;
        first.next = curr;

        if(first == A) A = last;

        return A;
    }
}
