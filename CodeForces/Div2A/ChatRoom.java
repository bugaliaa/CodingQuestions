package CodeForces.Div2A;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        sc.close();
        String hello = "hello";
        int x = 0;
        for(char c: word.toCharArray()){
            if(c == hello.charAt(x)) x++;
            if(x == 5){
                System.out.println("YES");
                break;
            }
        }
        if(x != 5)System.out.println("NO");
    }
}