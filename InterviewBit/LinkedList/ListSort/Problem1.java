package InterviewBit.LinkedList.ListSort;

// https://www.interviewbit.com/problems/sort-binary-linked-list/
// Sort Binary Linked List

public class Problem1 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode solve(ListNode A) {
        int count1 = 0;
        ListNode temp = A;
        int len = 0;

        while(temp != null){
            if(temp.val == 1){
                count1++;
                temp.val = 0;
            }
            len++;
            temp = temp.next;
        }

        temp = A;
        while(temp != null){
            if(len <= count1){
                temp.val = 1;
            }
            temp = temp.next;
            len--;
        }

        return A;
    }
}
