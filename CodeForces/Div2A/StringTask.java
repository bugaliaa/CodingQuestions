package CodeForces.Div2A;

import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder();
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y'){
                continue;
            }else{
                sb.append('.');
                sb.append(word.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
