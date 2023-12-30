package main.finale.leetcode.Top100;

public class _1071_Greatest_Common_Divisor_of_Strings {

    public static void main(String[] args) {
        String res = gcdOfStrings("ABCABC", "ABC");
        System.out.println(res);
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private static int gcd(int a , int b) {
        return b==0 ? a : gcd(b, a%b);
    }
}
