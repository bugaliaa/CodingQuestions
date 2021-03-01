package Algorithms.LinearSearch;

import java.io.*;

public class SEGM01 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            int n = s.length();
            int start = n;
            int end = -1;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '1'){
                    start = Math.min(i, start);
                    end = Math.max(i, end);
                }
            }
            if(end == -1){
                System.out.println("NO");
            }else{
                for(int i = start; i <= end; i++){
                    if(s.charAt(i) == '0'){
                        System.out.println("NO");
                        return;
                    }
                }
                System.out.println("YES");
            }
        }
    }
}
