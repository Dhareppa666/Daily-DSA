package main.finale.leetcode.Top100;

public class _76_Minimum_Window_Substring {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        String res = minWindow(s, t);
        System.out.println(res);
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        } else if (s.equals(t)) {
            return s;
        }
        int[] freq1 = new int[123];
        for (int i = 0; i < t.length(); i++) {
            freq1[t.charAt(i)]++;
        }
        int[] freq2 = new int[123];
        int left = 0, right = 0;
        String res = "";
        while (right < s.length()) {
            freq2[s.charAt(right)]++;
            while (isArrEqual(freq1, freq2)) {
                if (res == "" || res.length() > right - left) {
                    res = s.substring(left, right + 1);
                }
                freq2[s.charAt(left)]--;
                left++;
            }
            right++;
        }
        return res;
    }

    public static boolean isArrEqual(int[] t, int[] s) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] != 0 && t[i] > s[i]) {
                return false;
            }
        }
        return true;
    }
}
