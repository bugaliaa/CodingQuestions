package InterviewBit.Maths;

import java.util.*;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(A));
    }
    public static int isPalindrome(int A) {
        int a = A;
        int B = 0;
        while(a > 0){
            int digit = a%10;
            B = B*10 + digit;
            a /= 10;
        }
        if(A == B) return 1;
        else return 0;
    }
}
