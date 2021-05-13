package CodeChef.May21.LC;

import java.util.Scanner;

public class TCTCTOE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            char[][] grid = new char[3][3];
            int x = 0;
            int o = 0;
            int blank = 0;
            for(int i = 0; i < 3; i++){
                String s = sc.nextLine();
                for(int j = 0; j < 3; j++){
                    grid[i][j] = s.charAt(j);
                    if(grid[i][j] == 'X') x++;
                    else if(grid[i][j] == 'O') o++;
                    else blank++;
                }
            }
            System.out.println(check(grid, x, o, blank));            
        }
        sc.close();
    }
    public static int check(char[][] grid, int x, int o, int blank){
        if(x > o+1) return 3;
        if(x < o) return 3;
        boolean xWin = won(grid, 'X');
        boolean oWin = won(grid, 'O');
        if(xWin && oWin) return 3;
        if(xWin && x == o) return 3;
        if(oWin && x > o) return 3;
        if(xWin || oWin) return 1;
        if(blank == 0) return 1;

        return 2;
    }
    public static boolean won(char grid[][], char c){
        //diagonals
        if(grid[0][0] == c && grid[1][1] == c && grid[2][2] == c) return true;
        if(grid[0][2] == c && grid[1][1] == c && grid[2][0] == c) return true;
        
        //first row first col
        if(grid[0][0] == c && grid[0][1] == c && grid[0][2] == c) return true;
        if(grid[0][0] == c && grid[1][0] == c && grid[2][0] == c) return true;
        
        //second row second col
        if(grid[1][0] == c && grid[1][1] == c && grid[1][2] == c) return true;
        if(grid[0][1] == c && grid[1][1] == c && grid[2][1] == c) return true;
        
        //third row third col
        if(grid[2][0] == c && grid[2][1] == c && grid[2][2] == c) return true;
        if(grid[0][2] == c && grid[1][2] == c && grid[2][2] == c) return true;
        
        return false;
    }
}
