package SDE.Day16;

// https://practice.geeksforgeeks.org/problems/anagram-1587115620/1
// Anagram (GFG)

public class Problem7 {
    public static void main(String[] args) {
        String a = "geeks";
        String b = "segek";
        System.out.println(isAnagram(a, b));
    }
    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()) return false;
        int[] table = new int[256];
        for(int i = 0; i < a.length(); i++){
            table[a.charAt(i) - 'a']++;
            table[b.charAt(i) - 'a']--;
        }
        for(int i = 0; i < table.length; i++){
            if(table[i] != 0) return false;
        }
        return true;
    }
}
