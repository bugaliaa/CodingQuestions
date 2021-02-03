package InterviewBit.Maths;

import java.util.Scanner;

public class LargestCoprimeDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println(cpFact(A, B));
    }

    public static int cpFact(int A, int B) {
        int x = Integer.MIN_VALUE;
        for(int i = 2; i <= A; i++){
            if(A%i == 0){
                int y = gcd(B, i);
                if(y == 1) x = Math.max(i, x);
            }
        }
        if(x == Integer.MIN_VALUE) return 1;
        return x;
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
