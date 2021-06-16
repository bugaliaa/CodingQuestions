package InterviewBit.LinkedList.PointerMove;

// https://www.interviewbit.com/problems/rotate-list/
// Rotate List

public class Problem4 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode rotateRight(ListNode A, int B) {
        ListNode temp = A;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        B = B%count;
        if(B == 0) return A;
        temp = A;

        int num = count-B;
        while(num > 1){
            num--;
            temp = temp.next;
        }

        ListNode head = temp.next;
        temp.next = null;
        temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = A;

        return head;
    }
}
