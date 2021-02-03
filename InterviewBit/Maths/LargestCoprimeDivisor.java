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
        while(gcd(A, B) != 1){
            A = A / gcd(A, B);
        }
        return A;
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
