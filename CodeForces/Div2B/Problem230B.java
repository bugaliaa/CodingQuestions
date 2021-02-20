package CodeForces.Div2B;

import java.util.*;

public class Problem230B {

    static int ar[] = new int[1000001];
    static Set<Long> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
              
        sieveMethod();
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            if(set.contains(x)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
    public static void sieveMethod(){
        set.add((long)4);
        for(int i = 3; i < 1000001; i += 2){
            if(ar[i] == 0){
                set.add((long)(i*i));
                for(int j = i; j <= 1000000; j += i){
                    ar[j] = 1;
                }
            }
        }
    }
}
