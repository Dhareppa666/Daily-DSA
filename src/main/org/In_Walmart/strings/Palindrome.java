package org.In_Walmart.strings;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ABCXA", 0, 4));
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if(start>=end)
            return true;
        if(s.charAt(start)!=s.charAt(end))
            return false;
        return isPalindrome(s, start+1, end-1);
    }
}
