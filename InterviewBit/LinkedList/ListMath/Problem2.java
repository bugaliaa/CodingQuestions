package InterviewBit.LinkedList.ListMath;

// https://www.interviewbit.com/problems/list-cycle/
// List Cycle

public class Problem2 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }

        if(!flag) return null;

        while(head != slow){
            head = head.next;
            slow = slow.next;
        }

        return head;
    }
}
