package main.finale.leetcode.Daily;

public class _680_Valid_Palindrome_II {

    public static void main(String[] args) {
        _680_Valid_Palindrome_II obj = new _680_Valid_Palindrome_II();
        boolean res = obj.validPalindrome("abdca");
        System.out.println(res);
    }

    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() -1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return isPal(i, j-1, s) || isPal(i+1, j, s);
            }
            i++; j--;
        }
        return true;
    }

    public boolean isPal(int i, int j, String s) {
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
