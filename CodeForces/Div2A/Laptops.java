package CodeForces.Div2A;

import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        boolean flag = false;
        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a != b){
                flag = true;
                break;
            }
        }
        sc.close();
        if(flag) System.out.println("Happy Alex");
        else System.out.println("Poor Alex");
    }
}
