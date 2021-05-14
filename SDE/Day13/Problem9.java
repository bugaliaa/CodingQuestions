package SDE.Day13;

import java.util.*;

// https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1
// Parenthesis Checker (GFG)

public class Problem9 {
    public static void main(String[] args) {
        String x = "{}{(}))}";
        if(ispar(x)) System.out.println("balanced");
        else System.out.println("not balanced");
    }
    public static boolean ispar(String x){
        Stack<Character> stack = new Stack<>();
        if(x.charAt(0) == '}' || x.charAt(0) == ']' || x.charAt(0) == ')') return false;

        for(char c: x.toCharArray()){
            if(c == '[' || c == '{' || c == '(') stack.push(c);
            else if(!stack.empty()){
                if((c == ']' && stack.peek() == '[') || (c == '}' && stack.peek() == '{') || (c == ')' && stack.peek() == '(')) stack.pop();
                else return false;
            }
        }
        if(stack.size() == 0) return true;
        return false;
    }
}
