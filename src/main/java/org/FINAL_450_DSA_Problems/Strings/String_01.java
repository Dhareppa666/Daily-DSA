package org.FINAL_450_DSA_Problems.Strings;

import java.util.Arrays;

//1. Reverse a String.
public class String_01 {

    public static void main(String[] args) {
        String s = "abcd";
        String res1 = reverseAString11(s);
        System.out.println(res1);
        System.out.println(isPalindrome("abcba"));

        String res2 = reverseAString2(s);
        System.out.println(res2);

        String res3 = reverseAString3(s);
        System.out.println(res3);

        char[] arr = {'a','b','c','d'};
        String res4 = reverseAString4(arr);
        System.out.println(res4);
    }

    private static String reverseAString11(String s) {
        int l=0, h = s.length()-1;
        char[] arr = s.toCharArray();
        while (l<h){
            char temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++; h--;
        }
        return Arrays.toString(arr);
    }

    private static boolean isPalindrome(String s) {
        int l=0, h = s.length()-1;
        while (l<h){
            if (s.charAt(l) != s.charAt(h))
                return false;
            l++; h--;
        }
        return true;
    }

    private static String reverseAString1(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static String reverseAString2(String s) {
        String res = "";
        for (int i=s.length()-1; i>=0;i--){
            res += s.charAt(i);
        }
        return res;
    }

    private static String reverseAString3(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    //from leetcode.
    private static String reverseAString4(char[] s) {
        int length = s.length;
        int x =0;
        int y = length-1;
        int mid = length/2;
        for(int i=0; i<mid; i++){
            char temp = s[x];
            s[x] = s[y];
            s[y] = temp;
            x++;
            y--;
        }
        System.out.println(s);
        return s.toString();
    }

}
