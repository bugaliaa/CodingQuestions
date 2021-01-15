package CodeForces.Div2A;

import java.util.*;
public class ValeraAndX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] c = new char[n][n];
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            for(int j = 0; j < n; j++){
                char temp = s.charAt(j);
                set.add(temp);
                c[i][j] = temp;
            }
        }
        sc.close();
        boolean flag = true;
        if(set.size() == 2){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if((i == j || i+j == n-1) && c[i][j] != c[0][0]){
                        flag = false;
                        break;
                    }else if((i != j && i+j != n-1) && c[i][j] == c[0][0]){
                        flag = false;
                        break;
                    }
                }
            }
        }else{
            flag = false;
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
