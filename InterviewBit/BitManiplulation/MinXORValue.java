package InterviewBit.BitManiplulation;

import java.util.*;

public class MinXORValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i < n; i++) A.add(sc.nextInt());
        sc.close();

        System.out.println(findMinXor(A));

    }

    public static int findMinXor(ArrayList<Integer> A) {
        int ans = Integer.MAX_VALUE;

        Collections.sort(A);
        for(int i = 0; i < A.size()-1; i++){
            ans = Math.min(A.get(i)^A.get(i+1), ans);
        }

        return ans;
    }
}
