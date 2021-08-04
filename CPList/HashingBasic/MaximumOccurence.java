package CPList.HashingBasic;

import java.util.*;

// https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-occurrence-9/

public class MaximumOccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();
        int table[] = new int[128];
        int n = s.length();
        for(int i = 0; i < n; i++){
            table[(int)s.charAt(i)]++;
        }

        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 0; i < 128; i++){
            if(table[i] > max){
                max = table[i];
                idx = i;
            }
        }
        char c = (char)(idx);
        System.out.print(c + " " + max);
    }
}
