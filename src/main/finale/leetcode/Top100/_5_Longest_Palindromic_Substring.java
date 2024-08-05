package main.finale.leetcode.Top100;

public class _5_Longest_Palindromic_Substring {

    public static void main(String[] args) {
        String res = longestPalindrome("babad");
        System.out.println(res);
    }

    public static String longestPalindrome(String s) {
        int sp = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPal(s, i, j)) {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp, sp + max);
    }

    public static boolean isPal(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) == s.charAt(right)) {
            return isPal(s, left + 1, right - 1);
        }
        return false;
    }

    // Approach 02
    public String longestPalindrome2(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        String res = "" + s.charAt(0);
        for (int index = 0; index < s.length(); index++) {
            String odd = expandFromMiddle(s, index, index);
            String even = expandFromMiddle(s, index, index + 1);
            if (odd.length() > res.length()) {
                res = odd;
            }

            if (even.length() > res.length()) {
                res = even;
            }
        }
        return res;
    }

    public String expandFromMiddle(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
