package CodeForces.Div2A;

import java.util.*;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        Set<Character> set = new HashSet<>();
        for(char c: str.toCharArray()) set.add(c);
        
        if(set.size() == 2) System.out.println(0);
        else{
            if(set.contains(',')){
                System.out.println(set.size()-4);
            }else{
                System.out.println(1);
            }
        }
    }
}
