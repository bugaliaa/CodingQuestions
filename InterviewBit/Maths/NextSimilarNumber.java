package InterviewBit.Maths;

import java.util.Scanner;

public class NextSimilarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        sc.close();
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        char[] a = A.toCharArray();

        int i = a.length-2;
        while(i >= 0 && Character.valueOf(a[i]) >= Character.valueOf(a[i+1])) i--;

        if(i >= 0){
            int j = a.length-1;
            while(Character.valueOf(a[j]) <= Character.valueOf(a[i])) j--;
            swap(a, i, j);
        }

        reverse(a, i+1, a.length-1);

        if(A.equals(new String(a)) || Double.parseDouble(new String(a)) < Double.parseDouble(A)){
            return "-1";
        }else{
            return new String(a);
        }

    }
    public static void swap(char[] a, int i, int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void reverse(char[] a, int l, int r){
        while(l < r){
            swap(a, l, r);
            l++;
            r--;
        }
    }
}
