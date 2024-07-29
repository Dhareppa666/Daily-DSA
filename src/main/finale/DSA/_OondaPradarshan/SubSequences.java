package main.finale.DSA._OondaPradarshan;

import java.util.*;

//powerset
public class SubSequences {

    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = AllPossibleStrings(s);
        //print all the subsequence.
        System.out.println("All possible subsequences are ");
        for (String it : ans) {
            System.out.print(it + " ");
        }

        rec(s, "", 0);
    }

    public static ArrayList<String> AllPossibleStrings(String s) {
        int n = s.length();
        ArrayList<String> ans = new ArrayList<>();
        for (int num = 0; num < (1 << n); num++) {
            String sub = "";
            for (int i = 0; i < n; i++) {
                //check if the ith bit is set or not
                if ((num & (1 << i)) != 0) {
                    sub += s.charAt(i);
                }
            }
            if (sub.length() > 0) {
                ans.add(sub);
            }
        }
        return ans;
    }

    public static void rec(String s, String f, int idx) {
        if(idx == s.length()) {
            System.out.println(f);
            return;
        }
        rec(s, f + s.charAt(idx), idx+1);
        rec(s, f , idx+1);
    }
}
