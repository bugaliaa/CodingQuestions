package InterviewBit.Strings.StringSimulation;

// https://www.interviewbit.com/problems/count-and-say/
// Count and Say

public class Problem5 {
    public String countAndSay(int A) {
        if(A == 1) return "1";
        if(A == 2) return "11";
        
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        s = s.append("11");
        for(int i = 3; i <= A; i++){
            s.append('&');
            t.setLength(0);
            int cnt = 1;
            for(int j = 1; j < s.length(); j++){
                if(s.charAt(j) != s.charAt(j-1)){
                    t.append(Integer.toString(cnt));
                    t.append(s.charAt(j-1));
                    cnt = 1;
                }else cnt++;
            }
            s.setLength(0);
            s.append(t.toString());
        }

        return s.toString();
    }
}
