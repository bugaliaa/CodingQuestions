package InterviewBit.Hashing.KeyFormation;

// https://www.interviewbit.com/problems/copy-list/
// Copy List

public class Problem4 {
    class RandomListNode {
        int label;
        RandomListNode next, random;
        RandomListNode(int x) { this.label = x; }
    };
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode curr = head, temp = null;

        while(curr != null){
            temp = curr.next;
            curr.next = new RandomListNode(curr.label);
            curr.next.next = temp;
            curr = temp;
        }

        curr = head;

        while(curr != null){
            if(curr.next != null){
                curr.next.random = (curr.random != null) ? curr.random.next : curr.random;
            }

            curr = curr.next.next;
        }

        RandomListNode origin = head, copy = head.next;

        temp = copy;

        while(origin != null){
            origin.next = origin.next.next;

            copy.next = (copy.next != null) ? copy.next.next : copy.next;
            origin = origin.next;
            copy = copy.next;
        }

        return temp;
    }
}
