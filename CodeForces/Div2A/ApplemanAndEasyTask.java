package CodeForces.Div2A;

import java.io.*;


public class ApplemanAndEasyTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] table = new char[n][n];
        
        for(int i = 0; i < n; i++){
            table[i] = br.readLine().toCharArray();
        }
        br.close();
        boolean flag = true;
        for(int i = 0; i < n; i++){
            
            int x = 0;
            for(int j = 0; j < n; j++){
                if(table[i][j] == 'o'){
                    if(i+1 < n && table[i+1][j] == 'x') x++;
                    if(i-1 >= 0 && table[i-1][j] == 'x') x++;
                    if(j+1 < n && table[j+1][j] == 'x') x++;
                    if(j-1 >= 0 && table[j-1][j] == 'x') x++;
                }
                if(x%2 == 1) flag = false;
                
            }
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
