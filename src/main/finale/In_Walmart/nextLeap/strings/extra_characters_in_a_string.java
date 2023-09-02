package main.finale.In_Walmart.nextLeap.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class extra_characters_in_a_string {

    public static void main(String[] args) {
        int extChars = minExtraChar("leetscode", new String[]{"leet","code","leetcode"});
        System.out.println(extChars);
    }

    public static int minExtraChar(String s, String[] dictionary) {
        int[] dp = new int[s.length() +1];
        Arrays.fill(dp, -1);
        Set<String> set = new HashSet<>(Arrays.asList(dictionary));
        return getMinChars(dp, set, s, 0);
    }

    public static int getMinChars(int[] dp, Set<String> set, String s, int index) {
        if(index>= s.length()){
            return 0;
        }
        if(dp[index]!=-1) {
            return dp[index];
        }
        int res = Integer.MAX_VALUE;
        for(int i = index; i< s.length(); i++) {
            String str = s.substring(index, i+1);
            if(set.contains(str)){
                res = Math.min(res, getMinChars(dp, set, s, i+1));
            } else {
                res = Math.min(res, i - index + 1 + getMinChars(dp, set, s, i+1));
            }
        }
        return dp[index] = res;
    }
}
