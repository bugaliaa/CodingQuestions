package CodeForces.Div2A;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int k = 0;
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                for(int j = 0; j < m; j++) System.out.print('#');
                
            }else{
                if(k++%2 == 0){
                    for(int j = 0; j < m-1; j++) System.out.print('.');
                    System.out.print('#');                    
                }else{
                    System.out.print('#');
                    for(int j = 0; j < m-1; j++) System.out.print('.');
                }
            }
            System.out.println();
        }
        
    }
}
