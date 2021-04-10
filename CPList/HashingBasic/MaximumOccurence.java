package CPList.HashingBasic;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

// https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-occurrence-9/

public class MaximumOccurence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.replace(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        Entry<Character, Integer> max = null;
        for(Entry<Character, Integer> e: map.entrySet()){
            if(max == null || e.getValue().compareTo(max.getValue()) > 0){
                max = e;
            }else if(e.getValue().compareTo(max.getValue()) == 0 && (int)e.getKey() < (int)max.getKey()){
                max = e;
            }
        }
        System.out.println(max.getKey() + " " + max.getValue());
    }
}
