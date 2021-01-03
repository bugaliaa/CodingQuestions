package CodeForces.Div2A;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        sc.close();
        int point = 0;
        for(int i = 0, j = 0; i < str1.length(); i++, j++){
            if(str1.charAt(i) == str2.charAt(j)) continue;
            else if((int)str1.charAt(i) < (int)str2.charAt(j)){
                point = -1;
                break;
            }else{
                point = 1;
                break;
            }
        }
        System.out.println(point);
    }
}
