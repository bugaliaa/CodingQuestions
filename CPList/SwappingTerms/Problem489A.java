package CPList.SwappingTerms;

import java.util.*;

public class Problem489A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();

        List<int[]> swaps = new ArrayList<>();

        int c = 0;
        for(int i = 0; i < n-1; i++){
            int min_idx = i;
            for(int j = i+1; j < n; j++){
                if(a[j] < a[min_idx]) min_idx = j;
            }
            if(min_idx != i){
                int temp = a[i];
                a[i] = a[min_idx];
                a[min_idx] = temp;

                c++;
                int t[] = {i, min_idx};
                swaps.add(t);
            }
        }

        System.out.println(c);
        for(int[] t: swaps){
            System.out.println(t[0] + " " + t[1]);
        }
    }
}
