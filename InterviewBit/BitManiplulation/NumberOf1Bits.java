package InterviewBit.BitManiplulation;

import java.util.Scanner;

public class NumberOf1Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        sc.close();
        System.out.println(numSetBits(a));
    }

    public static int numSetBits(long a) {
        int ans = 0;
        while(a != 0){
            a &= a-1;
            ans++;
        }
        return ans;
    }
}
