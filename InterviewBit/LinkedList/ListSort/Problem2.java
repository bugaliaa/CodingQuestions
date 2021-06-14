package InterviewBit.LinkedList.ListSort;

// https://www.interviewbit.com/problems/partition-list/
// Partition List

public class Problem2 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode partition(ListNode A, int B) {
        ListNode temp = A;
        ListNode head = new ListNode(-123);
        ListNode next = head;
        
        while(temp != null){
            if(temp.val < B){
                ListNode node = new ListNode(temp.val);
                next.next = node;
                next = node;
            }
            temp = temp.next;
        }

        temp = A;

        while(temp != null){
            if(temp.val >= B){
                ListNode node = new ListNode(temp.val);
                next.next = node;
                next = node;
            }
            temp = temp.next;
        }

        return head.next;
    }
}
