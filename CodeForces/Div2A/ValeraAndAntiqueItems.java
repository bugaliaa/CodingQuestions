package CodeForces.Div2A;

import java.util.*;

public class ValeraAndAntiqueItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        
        List<Integer> seller = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            boolean flag = true;
            for(int j = 0; j < k; j++){
                int x = sc.nextInt();
                if(v > x && flag){
                    count++;
                    seller.add(i+1);
                    flag = false;
                }
            }
        }
        sc.close();
        
        if(seller.size() != 0){
            System.out.println(count);
            for(int i: seller) System.out.print(i + " ");
        }else{
            System.out.println(0);
        }
    }
}
