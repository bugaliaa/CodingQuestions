package CodeForces.Div2B;

import java.util.*;
import java.io.*;

public class Problem279B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int t = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = Integer.parseInt(str[i]);
        } 
        br.close();
        
        int c = 0;
        int j = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += ar[i];
            if(sum <= t){
                c++;
            }else{
                sum = sum - ar[j];
                j++;
            }
        }
        System.out.println(c);
    }
}