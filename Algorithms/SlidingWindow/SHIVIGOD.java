package Algorithms.SlidingWindow;

import java.util.*;

public class SHIVIGOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] ar = new long[n];
            int b = sc.nextInt();
            int a = sc.nextInt();
            Deque<Long> dq = new LinkedList<>();
            long sum = 0;
            for(int i = 0; i < a; i++){
                sum += ar[i];
                dq.add(ar[i]);
            }
            double avg = (double)sum/a;
            List<Integer> list = new ArrayList<>();
            

        }
        sc.close();
    }
}
