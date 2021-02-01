package InterviewBit.Maths;

import java.util.*;

public class PowerOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();

        System.out.println(isPower(A));
    }

    public static int isPower(int A){
        if(A == 1) return 1;

        for(int i = 2; i < A; i++){
            if(isInt(Math.log(A)/Math.log(i))) return 1;
        }

        return 0;
    }

    public static boolean isInt(Double k){
        return Math.floor(k) == k;
    }
}
