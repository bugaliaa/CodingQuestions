package CodeForces.Div2A;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        str = str.replace("WUB", " ");

        StringBuilder sb = new StringBuilder();
        String a[] = str.split("WUB");

        for(int i = 0; i < a.length; i++){
            if(a[i] != " ")sb.append(a[i].trim()+" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
