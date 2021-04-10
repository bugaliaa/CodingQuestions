package CPList.HashingBasic;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

// https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/perfect-pair-df920e90/?utm_source=header&utm_medium=search&utm_campaign=he-search

public class PerfectPair {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
       
      boolean sq[] = new boolean[2001];
      Arrays.fill(sq, false);
      for(int i = 1; i < Math.sqrt(2001); i++){
         if(i*i <= 2001) sq[i*i] = true;
         if(i*i*i <= 2001) sq[i*i*i] = true;
      }

      while(t-- > 0){
          Integer.parseInt(br.readLine());
          String[] str = br.readLine().split(" ");
          Map<Integer, Integer> map = new HashMap<>();
          List<Integer> list = new ArrayList<>();
          
         for(String s: str){
            if(map.containsKey(Integer.parseInt(s))){
               map.replace(Integer.parseInt(s), map.get(Integer.parseInt(s)+1));
            }else{
                map.put(Integer.parseInt(s), 1);
            }
         }
         for(Entry<Integer, Integer> e: map.entrySet()){
            list.add(e.getKey());
         }
         int c = 0;
         for(int i = 0; i < list.size(); i++){
            int x = map.get(list.get(i));
            if(x > 1 && sq[2*list.get(i)]) c += (x*(x-1))/2;
            for(int j = i+1; j < list.size(); j++){
               if(sq[list.get(i) + list.get(j)]) 
                  c += x*map.get(list.get(j));
            }               
         }
         System.out.println(c);
      }
      br.close();
   }
}
