package main.finale.DSA.arrays;

import java.util.ArrayList;
import java.util.List;

public class longestPalindromeSubString {

    public static void main(String[] args) {
//        System.out.println(longestPalindrome("ababb"));
        System.out.println(removeDuplicates("abbbabbbx",3));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        String res = null;

        boolean[][] dp = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }

        return res;
    }

    public static String removeDuplicates(String s, int k) {
        int i = 0, n = s.length(), count[] = new int[n];
        char[] stack = s.toCharArray();
        List<String> list = new ArrayList<>();
        for (int j = 0; j < n; ++j, ++i) {
            stack[i] = stack[j];
            count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
            if (count[i] == k) {
                i -= k;
            }
        }
        for(int x=0; x<i; x++)
            System.out.print(stack[x]);
        System.out.println("DONE");

        return new String(stack, 0, i);
    }
}
