package main.finale.leetcode.Top100;

public class _5_Longest_Palindromic_Substring {

    public static void main(String[] args) {
        String res = longestPalindrome("babad");
        System.out.println(res);
    }

    public static String longestPalindrome(String s) {
        int sp = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                if(isPal(s, i, j)) {
                    if(j-i+1 > max) {
                        max = j-i+1;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp, sp+max);
    }

    public static boolean isPal(String s, int left, int right) {
        if(left>=right) {
            return true;
        }
        if(s.charAt(left) == s.charAt(right)) {
            return isPal(s, left+1, right-1);
        }
        return false;
    }
}
