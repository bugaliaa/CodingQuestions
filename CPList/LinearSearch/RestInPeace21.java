package CPList.LinearSearch;

import java.io.*;

// https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/rest-in-peace-21-1/

public class RestInPeace21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            long a = Long.parseLong(br.readLine());
            if(a%21 == 0) System.out.println("The streak is broken!");
            else{
                char[] c = Long.toString(a).toCharArray();
                boolean flag = true;
                for(int i = 0; i < c.length-1; i++){
                    if(c[i] == '2' && c[i+1] == '1'){
                        System.out.println("The streak is broken!");
                        flag = false;
                    }
                }
                if(flag) System.out.println("The streak lives still in our heart!");
            }
        }
        br.close();
    }
}
