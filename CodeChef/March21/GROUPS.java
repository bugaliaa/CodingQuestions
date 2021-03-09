package CodeChef.March21;

import java.util.Scanner;

public class GROUPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            char[] c = sc.nextLine().toCharArray();
            int k = 0;
            for(int i = 0; i < c.length;){
                if(c[i] == '1'){
                    k++;
                    while(i < c.length){
                        if(c[i] == '1') i++;
                        else break; 
                    }
                }else{
                    i++;
                }
            }
            System.out.println(k);
        }
        sc.close();
    }
}
