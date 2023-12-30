package main.finale.DSA.tries;

import java.util.HashSet;

//Given a string S return the number of distinct substrings (including empty substring).
//Input: s = "sds"
//Output: 6
//Explanation: 6 distinct substrings are : s, d, sd, ds, sds and empty string.

public class Count_Distinct_Substrings_I {

    public static void main(String[] args) {
        int count = countDistinctSubstrings("sds");
        System.out.println(count);
    }

    public static int countDistinctSubstrings(String s) {
        //    For storing all distinct substrings of the given string.
        HashSet<String> distinctStrings = new HashSet<>();

        int n = s.length();

        //    Iterate through the string.
        for (int i = 0; i < n; i++) {
            //    Iterate till the end.
            for (int j = i; j < n; j++) {
                //    Current substring
                String temp = s.substring(i, j + 1);
                //    Insert the current substring into the HashSet.
                distinctStrings.add(temp);
            }
        }
        //    Return the total number of distinct substrings.
        return (distinctStrings.size() + 1);
    }
}
