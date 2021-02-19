package CodeForces.Div2B;

import java.util.Scanner;

public class Problem451B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();

        int ansa = -1;
        int ansb = n;
        boolean flag = true;

        for(int i = 1; i < n; i++){
            if(flag){
                if(a[i] < a[i-1]){
                    flag = false;
                    ansa = i-1;
                }
            }else{
                if(a[i] > a[i-1]){
                    ansb = i;
                    break;
                }
            }
        }
        if(ansa != -1){
            reverse(a, ansa, ansb-1);
            for(int i = 1; i < n; i++){
                if(a[i] < a[i-1]){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
        }
        if(flag){
            System.out.println("yes");
            if(ansa == -1) System.out.println("1 1\n");
            else System.out.println(ansa+1 + " " + ansb + "\n");
        }else{
            System.out.println("no");
        }
    }
    public static void reverse(int[] a, int l, int r){
        while(l < r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}