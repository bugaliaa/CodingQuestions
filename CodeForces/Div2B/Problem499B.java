package CodeForces.Div2B;

import java.util.*;

public class Problem499B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            String[] a = new String[2];
            a = sc.nextLine().split(" ");
            map.put(a[0], a[1]);
        }
        String[] sent = new String[n];
        sent = sc.nextLine().split(" ");
        sc.close();

        for(int i = 0; i < n; i++){
            if(map.get(sent[i]).length() < sent[i].length()){
                System.out.print(map.get(sent[i]) + " ");
            }else{
                System.out.print(sent[i] + " ");
            }
        }
        System.out.println();
    }
}
