package CodeForces.Div2B;

import java.util.*;

public class Problem493B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> f = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        int s1 = 0, s2 = 0;
        int l = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(i == n-1) l = x;
            if(x > 0){
                s1 += x;
                f.add(x);
            }else{
                s2 += x*(-1);
                s.add(x*(-1));
            }
        }
        sc.close();
        if(s1 > s2) System.out.println("first");
        else if(s2 > s1) System.out.println("second");
        else{
            if(f.equals(s)){
                if(l > 0) System.out.println("first");
                else System.out.println("second");
            }else{
                int i = 0;
                int j = 0;
                while(i != f.size() || j != s.size()){
                    if(f.get(i) == s.get(j)){
                        i++;
                        j++;
                    }else{
                        if(f.get(i) > s.get(j)) System.out.println("first");
                        else System.out.println("second");
                        break;
                    }
                }
            }
        }
    }
}
