package org.In_Walmart.Raj_Vik.Recursion;

public class Reverse_String {

    public static void main(String[] args) {
        String res = reverseString("ABCDE");
        System.out.println(res);
    }

    private static String reverseString(String s) {
        if(s.length()<=1){
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}
