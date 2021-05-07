package CodeChef.May21.LC;

import java.io.*;

public class LKDNGOLF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String[] s = br.readLine().split(" ");
            Long n = Long.parseLong(s[0]);
            Long x = Long.parseLong(s[1]);
            Long k = Long.parseLong(s[2]);

            Long remainder = (n+1)%k;
            if(x%k == 0 || x%k == remainder) System.out.println("YES");
            else System.out.println("NO");
        }
        br.close();
    }
}
