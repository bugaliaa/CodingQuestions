package InterviewBit.LinkedList.ListTrick;

// https://www.interviewbit.com/problems/reverse-alternate-k-nodes/
// Reverse Alternate K Nodes

public class Problem2 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode solve(ListNode A, int B) {
        ListNode curr = A;
        ListNode next = null;
        ListNode prev = null;
        int c = 0;

        while(curr != null && c < B){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
        }

        if(A != null) A.next = curr;

        c = 0;
        while(curr != null && c < B-1){
            curr = curr.next;
            c++;
        }

        if(curr != null) curr.next = solve(curr.next, B);

        return prev;
    }
}
