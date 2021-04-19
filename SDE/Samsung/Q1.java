package SDE.Samsung;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(func("what to do?"));
    }
    public static int func(String str){
        int C = 0;
        int V = 0;
        int S = 0;

        for(char c: str.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') V++;
            else if((int)c >= 65 && (int)c <= 65) C++;
            else if(c == ' ') continue;
            else S++;
        }

        return C - V + S;
    }
}
