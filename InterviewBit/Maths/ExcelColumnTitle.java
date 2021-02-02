package InterviewBit.Maths;

import java.util.Scanner;

public class ExcelColumnTitle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        System.out.println(convertToTitle(A));
    }
    public static String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        while(A != 0){
            if(A%26 == 0){
                sb.append('Z');
                A = A - 26;
            }
            else{
                sb.append((char)(A%26+64));
                A = A - (A%26);
            }
            
            A = (int)A/26;
        }
        return sb.reverse().toString();
    }
}
