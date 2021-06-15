package InterviewBit.LinkedList.ListMath;

// https://www.interviewbit.com/problems/add-two-numbers-as-lists/
// Add two numbers as lists

public class Problem1 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;

        int carry = 0;

        while(A != null && B != null){
            int sum = A.val + B.val + carry;
            carry = sum >= 10 ? 1 : 0;
            int digit = sum%10;
            ListNode newNode = new ListNode(digit);
            curr.next = newNode;
            curr = newNode;
            A = A.next;
            B = B.next;
        }
        while(A != null){
            int sum = A.val + carry;
            carry = sum >= 10 ? 1 : 0;
            int digit = sum%10;
            ListNode newNode = new ListNode(digit);
            curr.next = newNode;
            curr = newNode;
            A = A.next;
        }
        while(B != null){
            int sum = B.val + carry;
            carry = sum >= 10 ? 1 : 0;
            int digit = sum%10;
            ListNode newNode = new ListNode(digit);
            curr.next = newNode;
            curr = newNode;
            B = B.next;
        }

        if(carry == 1){
            ListNode newNode = new ListNode(1);
            curr.next = newNode;
            curr = newNode;
        }

        return ans.next;
    }
}
