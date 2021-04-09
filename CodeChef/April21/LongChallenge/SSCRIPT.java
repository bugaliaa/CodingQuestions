package CodeChef.April21.LongChallenge;

import java.util.Scanner;

public class SSCRIPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            char[] c = sc.nextLine().toCharArray();
            boolean flag = false;
            int count = 0;
            int max = 0;
            for(int i = 0; i < n; i++){
                if(c[i] == '*'){
                    count++;
                    max = Math.max(max, count);
                }else count = 0;
                if(count == k){
                    flag = true;
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
