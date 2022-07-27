package org.arrays;

import java.util.ArrayList;
import java.util.List;

public class Interleaving_String {

    public static void main(String[] args) {
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()){
            return false;
        }
        s1 = s1+ s2;
        List<Character> list = new ArrayList<>();
        for(int i=0; i<s1.length(); i++){
            list.add(s1.charAt(i));
        }
        for(int i=0; i<s1.length(); i++){
            if(list.contains(s3.charAt(i))){
                list.remove(list.indexOf(s3.charAt(i)));
            } else {
                return false;
            }
        }
        return true;
    }
}
