package org.Tech.Dose.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class SubSequence {

    private static HashSet<String> al = new HashSet<>();

    public static void main(String[] args) {
        String s = "cba";
        findsubsequences(s, ""); // Calling a function
        System.out.println(al);
        System.out.println(al.size());
    }

    private static void findsubsequences(String s,
                                         String ans) {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }

        // We add adding 1st character in string
        findsubsequences(s.substring(1), ans + s.charAt(0));

        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findsubsequences(s.substring(1), ans);
    }
}
