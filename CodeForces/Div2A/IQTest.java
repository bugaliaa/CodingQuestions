package CodeForces.Div2A;

import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countE = 0; int indexE = 0; int indexO = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x%2 == 0){
                countE++;
                indexE = i;
            }else{
                
                indexO = i;
            }
        }
        sc.close();
        if(countE == 1) System.out.println(indexE+1);
        else System.out.println(indexO+1);
    }
}
