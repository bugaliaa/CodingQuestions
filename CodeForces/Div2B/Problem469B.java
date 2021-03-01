package CodeForces.Div2B;

import java.io.*;

public class Problem469B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int p = Integer.parseInt(str[0]);
        int q = Integer.parseInt(str[1]);
        int l = Integer.parseInt(str[2]);
        int r = Integer.parseInt(str[3]);
        boolean[] A = new boolean[p];
        boolean[] B = new boolean[q];
        int[] vis = new int[r];
        for(int i = 0; i < p; i++){
            str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            for(int j = x; j < y; j++) A[j] = true;
        }
        for(int i = 0; i < q; i++){
            str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            for(int j = x; j < y; j++) B[j] = true;
        }
        br.close();
        for(int i = 0; i < p; i++){
            for(int j = 0; j < q; j++){
                if(A[i] && B[j]) vis[i-j] = vis[i-j-1] = 1;
            }
        }
        int ans = 0;
        for(int i = l; i <= r; i++){
            ans+=vis[i]|vis[i-1];
        }
        System.out.println(ans);
    }
}
