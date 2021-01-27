package InterviewBit.BitManiplulation;

import java.util.*;

public class SingleNumberII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for(int i = 0; i < n; i++) A.add(sc.nextInt());
        sc.close();

        System.out.println(singleNumber(A));
    }

    public static int singleNumber(final List<Integer> A) {
        int[] count = new int[32];

        for(int i = 0; i < 32; i++){
            for(int j = 0; j < A.size(); j++){
                if((A.get(j) & (1 << i)) != 0) count[i]++;
            }
        }

        int res = 0;
        for(int i = 0; i < 32; i++){
            res += (count[i]%3)*(1 << i);
        }
        return res;
    }
}
