package org.test;

import javax.validation.constraints.NotNull;

public class test {
    public static void main(String[] args) {


        System.out.println(isPalindrome(".a"));
    }
    public static boolean isPalindrome(String s) {
        boolean res = true;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ' ||s.charAt(i) == ',' || s.charAt(i) == ':'){

            } else {
                sb.append(s.charAt(i));
            }
        }
        s=sb.toString().toLowerCase();//a
        int last=s.length()-1;//0
        for(int i=0; i<s.length(); i++){//1
            if(s.charAt(i) != s.charAt(last)){
                return false;
            }
            last--;
        }
        return res;
    }
}
