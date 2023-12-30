package main.finale.DSA.recursion;

public class Basic_Recursion {

    public static void main(String[] args) {
        String input = "madam";
        boolean isPal = isPalindrome(0, input.length()-1, input);
        System.out.println(isPal);
    }

    public static boolean isPalindrome(int i, int j, String s) {
        if(i>=j) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)) {
            return false;
        }
        return isPalindrome(i+1, j-1, s);
    }
}
