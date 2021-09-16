package CPList.SwappingTerms;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1353B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            for(int i = 0; i < n; i++) b[i] = sc.nextInt();

            Arrays.sort(a);
            Arrays.sort(b);

            int i = 0;
            int j = n-1;
            for(int x = 0; x < k; x++){
                if(a[i] < b[j]){
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                    i++;
                    j--;
                }else{
                    break;
                }
            }

            int sum = 0;
            for(int x = 0; x < n; x++){
                sum += a[x];
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
