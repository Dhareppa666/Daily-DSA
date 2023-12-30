package main.finale.DSA.recursion;

public class String_is_pal {
    public static void main(String[] args) {
        System.out.println(isPalindromee("ABCDCBA", 0));
    }

    private static boolean isPalindromee(String s, int index) {
        if(index>=s.length()/2)
            return true;
        if(s.charAt(index) != s.charAt(s.length()-index-1))
            return false;
        else
            return isPalindromee(s, index+1);
    }
}
