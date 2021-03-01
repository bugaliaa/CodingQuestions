package Algorithms.HashingBasic;

import java.io.*;

// https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-occurrence-9/

public class MaximumOccurence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        int[] table = new int[128];
        for(char c: s.toCharArray()){
            table[(int)c]++;
        }
        int max = 0;
        for(int i = 1; i < 128; i++){
            if(table[i] > table[i-1]) max = i;
        }
        System.out.println(table[max] + " " + (char)max);
    }
}
