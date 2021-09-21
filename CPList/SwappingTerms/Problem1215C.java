package CPList.SwappingTerms;

import java.util.*;

public class Problem1215C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[] s = sc.nextLine().toCharArray();
        char[] t = sc.nextLine().toCharArray();
        sc.close();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(s[i] != t[i]){
                if(s[i] == 'a') a.add(i);
                else b.add(i);
            }
        }

        if(a.size()%2  != b.size()%2){
            System.out.println(-1);
            return;
        }

        List<int[]> list = new ArrayList<>();

        for(int i = 0; i+1 < a.size(); i += 2){
            int[] pair = {a.get(i), a.get(i+1)};
            list.add(pair);
        }
        for(int i = 0; i+1 < b.size(); i += 2){
            int[] pair = {b.get(i), b.get(i+1)};
            list.add(pair);
        }

        if(a.size()%2 == 1){
            int x = a.get(a.size()-1);
            int y = b.get(b.size()-1);

            list.add(new int[]{x, x});
            list.add(new int[]{x, y});
        }

        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println((list.get(i)[0] + 1) + " " + (list.get(i)[1] + 1));
        }
    }
}
