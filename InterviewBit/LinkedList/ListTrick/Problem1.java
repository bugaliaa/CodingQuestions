package InterviewBit.LinkedList.ListTrick;

// https://www.interviewbit.com/problems/kth-node-from-middle/
// Kth Node from Middle

public class Problem1 {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){val = x; next = null;}
    }
    public int solve(ListNode A, int B) {
        int n = 0;
        ListNode temp = A;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        n = (n/2)+1;

        int reqNode = n-B;

        if(reqNode <= 0) return -1;
        else{
            temp = A;
            int c = 1;

            while(temp != null){
                if(c == reqNode) return temp.val;
                c++;
                temp = temp.next;
            }
        }

        return -1;
    }
}
