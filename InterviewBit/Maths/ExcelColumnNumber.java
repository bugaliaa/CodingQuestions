package InterviewBit.Maths;

import java.util.Scanner;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        sc.close();
        System.out.println(titleToNumber(A));
    }
    public static int titleToNumber(String A) {
        char a[] = A.toCharArray();
        int k[] = new int[a.length];
        for(int i = 0; i < a.length; i++) k[i] = (int)a[i]-64;

        int ans = 0;
        int j = 0;
        for(int i = k.length-1; i >= 0; i--){
            ans += Math.pow(26, j++)*k[i];
        }
        return ans;
    }
}
