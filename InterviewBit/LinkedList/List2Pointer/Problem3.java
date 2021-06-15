package InterviewBit.LinkedList.List2Pointer;

// https://www.interviewbit.com/problems/merge-two-sorted-lists/
// Merge two sorted lists

public class Problem3 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A == null && B == null) return null;
        if(A == null) return B;
        if(B == null) return A;

        if(A.val > B.val){
            ListNode temp = A;
            A = B;
            B = temp;
        }

        ListNode res = A;
        while(A != null && B != null){
            ListNode temp = null;
            while(A != null  && A.val <= B.val){
                temp = A;
                A = A.next;
            }
            temp.next = B;

            ListNode t = A;
            A = B;
            B = t;
        }

        return res;
    }
}
