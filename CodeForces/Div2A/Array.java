package CodeForces.Div2A;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> zer = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] > 0) pos.add(i);
            else if(a[i] < 0) neg.add(i);
            else zer.add(i);
        }
        sc.close();

        if(pos.size() == 0){
            pos.add(neg.get(neg.size()-1));
            neg.remove(neg.size()-1);
            pos.add(neg.get(neg.size()-1));
            neg.remove(neg.size()-1);
        }

        if(neg.size()%2 == 0){
            zer.add(neg.get(neg.size()-1));
            neg.remove(neg.size()-1);
        }

        System.out.print(neg.size() + " ");
        print(neg, a);

        System.out.print(pos.size() + " ");
        print(pos, a);

        System.out.print(zer.size() + " ");
        print(zer, a);
        
    }

    static void print(List<Integer> l, int[] a){
        for(int i: l) System.out.print(a[i] + " ");
        System.out.println();
    }
}