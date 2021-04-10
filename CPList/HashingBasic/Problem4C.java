package CPList.HashingBasic;

import java.util.*;
import java.io.*;

// https://codeforces.com/problemset/problem/4/C

public class Problem4C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        while(n-- > 0){
            String s = br.readLine();
            if(map.containsKey(s)){
                System.out.println(s+map.get(s));
                map.replace(s, map.get(s)+1);
            }else{
                System.out.println("OK");
                map.put(s, 1);
            }
        }
    }
}
