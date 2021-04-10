package CPList.LinearSearch;

import java.util.Scanner;

// https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/mannas-first-name-4/

public class MannaFirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int a = 0;
            int b = 0;
            char[] arr = s.toCharArray();
            for(int i = 0; i <= arr.length-4; i++){
                if(arr[i]=='S' && arr[i+1]=='U'&&arr[i+2]=='V'&&arr[i+3]=='O')
                    a++;
            }
            for(int i = 0; i <= arr.length-7; i++){
                if(arr[i]=='S' && arr[i+1]=='U' && arr[i+2]=='V' && arr[i+3]=='O' && arr[i+4]=='J' && arr[i+5]=='I' && arr[i+6]=='T')
                    b++;
            }
            System.out.println("SUVO = " + (a-b) + ", SUVOJIT = " + b);
        }
        sc.close();
    }
}
