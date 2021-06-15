package InterviewBit.LinkedList.List2Pointer;

// https://www.interviewbit.com/problems/remove-nth-node-from-list-end/
// Remove Nth Node from list end

public class Problem5 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(n >= count) return head.next;
        temp = head;
        int i = 1;
        int cut = count-n;
        while(i < cut){
            i++;
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}
