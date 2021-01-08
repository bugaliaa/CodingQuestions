package CodeChef.JanuaryLong21;

import java.util.Scanner;

public class DIVTHREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int d = sc.nextInt();
            int A[] = new int[n];
            for(int i = 0; i < A.length; i++) A[i] = sc.nextInt();

            if(A.length == 1){
                if(A[0] < k) System.out.println(0);
                else{
                    if((A[0]/k) <= d) System.out.println(A[0]/k);
                    else System.out.println(d);
                }
            }else{
                int totalProblems = 0;
                for(int i: A) totalProblems += i;
                if(totalProblems < k) System.out.println(0);
                else{
                    if(totalProblems/k <= d) System.out.println(totalProblems/k);
                    else System.out.println(d);
                }
            }
        }
        sc.close();
    }    
}
