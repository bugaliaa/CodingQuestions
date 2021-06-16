package InterviewBit.LinkedList.PointerMove;

// https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/
// Swap List nodes in pairs

public class Problem3 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode swapPairs(ListNode A) {
        if(A == null) return null;
        ListNode temp = new ListNode(0);
        temp.next = A;
        ListNode curr = temp;

        while(curr.next != null && curr.next.next != null){
            ListNode first = curr.next;
            ListNode second = curr.next.next;

            first.next = second.next;
            curr.next = second;
            curr.next.next = first;
            curr = curr.next.next;
        }

        return temp.next;
    }
}
