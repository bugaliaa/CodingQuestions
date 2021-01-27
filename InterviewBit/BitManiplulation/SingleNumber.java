package InterviewBit.BitManiplulation;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) A.add(sc.nextInt());
        sc.close();
        System.out.println(singleNumber(A));
    }
    public static int singleNumber(final List<Integer> A) {
        if(A.size() == 0) return 0;

        int num = 0;
        for(int i = 0; i < A.size(); i++){
            num = num^A.get(i);
        }
        return num;
    }
}
