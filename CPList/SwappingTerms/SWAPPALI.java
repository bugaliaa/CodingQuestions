package CPList.SwappingTerms;

import java.util.Scanner;

public class SWAPPALI {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
        sc.close();
    }
    public static void solve(){
        int n = sc.nextInt();
        sc.nextLine();
        char[] s = sc.nextLine().toCharArray();
            
        if(n == 1){
            System.out.println("YES");
            System.out.println(0);
            return;
        }

        int ans = 0;
        boolean l = false, r = false;
        for(int i = 0, j = n-1; i < j; i++, j--){
            if(s[i] == s[j]){
                l = false;
                r = false;
                continue;
            }
            if(i+1 == j){
                System.out.println("NO");
                return;
            }
            if(!l && s[i+1] == s[j]){
                char temp = s[i+1];
                s[i+1] = s[i];
                s[i] = temp;
                l = true;
                r = false;
                ans++;
            }else if(!r && s[j-1] == s[i]){
                char temp = s[j];
                s[j] = s[j-1];
                s[j-1] = temp;
                l = false;
                r = true;
                ans++;
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES\n" + ans);
    }
}
