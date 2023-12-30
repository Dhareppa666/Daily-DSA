package main.finale.leetcode.Weekly;

public class A2825_Make_String_a_Subsequence_Using_Cyclic_Increments {

    public static void main(String[] args) {
        boolean res = canMakeSubsequence("abc", "ad");
        System.out.println(res);
    }

    public static boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        for (char t: str2.toCharArray()) {
            char c = (t == 'z') ? 'z' : (char) (t-1);
            while (i<str1.length() &&( str1.charAt(i) != t && str1.charAt(i) != c)) {
                i++;
            }
            if(i>=str1.length()) {
                return false;
            }
            i++;
        }
        return true;
    }
}
