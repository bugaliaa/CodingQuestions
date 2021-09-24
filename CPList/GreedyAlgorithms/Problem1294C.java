package CPList.GreedyAlgorithms;

import java.util.*;

public class Problem1294C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            Set<Integer> set = new HashSet<>();

            for(int i = 2; i*i <= n; i++){
                if(n%i == 0 && !set.contains(i)){
                    set.add(i);
                    n = n/i;
                    break;
                }
            }
            for(int i = 2; i*i <= n; i++){
                if(n%i == 0 && !set.contains(i)){
                    set.add(i);
                    n = n/i;
                    break;
                }
            }

            if(set.size() < 2 || set.contains(n) || n == 1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                set.add(n);
                for(int i: set) System.out.print(i + " ");
                System.out.println();
            }
            
        }
        sc.close();
    }
}
