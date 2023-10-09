package main.finale;

import java.util.*;

public class Yodle {

    public static void main(String[] args) {
        String input = "bangalore";
        String reverseString = reverseString(input);
        System.out.println("The reverse String is: "+reverseString);

        Map<String, Integer> map = new HashMap<>();
        for(Map.Entry<String, Integer> m: map.entrySet()){
            m.getKey();
            m.getValue();
        }
    }

    public static String reverseString(String str){
        if(str == null || str.length()<1){
            return "";
        }
        int length = str.length()-1;
        StringBuilder sb = new StringBuilder();
        for(int i=length; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

/*
  2wire-> 1mtr
  1hr to burn
  ---------
         ---------


 */
