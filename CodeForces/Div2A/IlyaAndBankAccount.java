package CodeForces.Div2A;

import java.util.Scanner;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n >= 0){
            System.out.println(n);
        }else{
            int a = n/10;
            int b = (n/100)*10 + n%10;
            System.out.println(Math.max(a, b));
        }
        
    }
}
