package SDE;

public class MoreOnes {
    public static void main(String[] args) {
        String a = "0111";
        System.out.println(helper(a));
    }
    public static int helper(String a){
        int cnt = 0;
        int n = a.length();

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                if(a.charAt(j) == '1') sum++;
                else sum--;
                if(sum > 0) cnt++;
                else cnt--;
            }
        }

        return cnt;
    }
}
