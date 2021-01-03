package CodeForces.Div2A;

import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >= 0){
            String word = sc.nextLine();
            if(word.length() > 10){
                char beg = word.charAt(0);
                char end = word.charAt(word.length()-1);
                int len = word.length()-2;
                System.out.print(beg);
                System.out.print(len);
                System.out.println(end);
            }
            else System.out.println(word);
        }
        sc.close();
    }
}
