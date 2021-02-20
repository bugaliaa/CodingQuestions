package CodeForces.Div2B;

import java.util.Scanner;

public class Problem508B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        sc.close();

        boolean flag = false;
        
        for(int i = 0; i < a.length; i++){
            if((Character.getNumericValue(a[i]) & 1) != 1 && Character.getNumericValue(a[i]) < Character.getNumericValue(a[a.length-1])){
                char temp = a[i];
                a[i] = a[a.length-1];
                a[a.length-1] = temp;
                flag = true;
                break;
            }
        }
        if(!flag){
            for(int i = a.length-2; i >= 0; i--){
                if((Character.getNumericValue(a[i]) & 1) != 1 && Character.getNumericValue(a[i]) > Character.getNumericValue(a[a.length-1])){
                    char temp = a[i];
                    a[i] = a[a.length-1];
                    a[a.length-1] = temp;
                    flag = true;
                    break;
                }
            }
        }        
        if(flag){
            for(char c: a) System.out.print(c);
        }else{
            System.out.print(-1);
        }
        System.out.println();
    }
}