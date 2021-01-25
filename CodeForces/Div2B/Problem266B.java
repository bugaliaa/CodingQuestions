package CodeForces.Div2B;

import java.util.Scanner;

public class Problem266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
        sc.close();

        char[] a = s.toCharArray();

        while(t-- > 0){
            for(int i = 0; i < n-1; ){
                if(a[i] == 'B' && a[i+1] == 'G'){
                    char temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    i += 2;
                }else{
                    i++;
                }
            }
        }
        for(char c: a) System.out.print(c);
    }
}
