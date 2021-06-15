package InterviewBit.LinkedList.PointerMove;

// https://www.interviewbit.com/problems/even-reverse/
// Even Reverse

import java.util.*;

public class Problem2 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode solve(ListNode A) {
        ListNode temp = A;
        List<Integer> list = new ArrayList<>();
        int l = 0;

        // Add elements at even position to the list
        while(temp != null){
            if(l%2 == 1){
                list.add(temp.val);
            }
            l++;

            temp = temp.next;
        }

        int i = 0;

        // Reverse original list
        ListNode rev = reverse(A);

        temp = rev;

        if(l%2 == 1) rev = rev.next;

        // change the values of the reversed list with the values in List
        while(rev != null){
            rev.val = list.get(i);
            i++;
            rev = rev.next.next;
        }

        // reverse the reversed list
        temp = reverse(temp);

        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr;

        while(next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
