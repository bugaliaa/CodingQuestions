package CodeForces.Div2A;

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eq = sc.nextLine();
        sc.close();
        int table[] = new int[4];
        for(char c: eq.toCharArray()){
            if(c != '+')table[Character.getNumericValue(c)]++;
        }
        StringBuilder sb = new StringBuilder();
        while(table[1]-- > 0){
            sb.append("1+");
        }
        while(table[2]-- > 0){
            sb.append("2+");
        }
        while(table[3]-- > 0){
            sb.append("3+");
        }
        if(sb.charAt(sb.length()-1) == '+')sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
