package main.finale.leetcode.Top100;

public class _91_Decode_Ways_03 {

    public static void main(String[] args) {
        int res = numDecodings("226");
        System.out.println(res);
    }

    // BOTTOM UP APPROACH.......>>>>>
    // TIME: O(n)
    // SPACE: O(n)
    public static int numDecodings(String s) {
        if (s == null || s.charAt(0) == '0') {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int two_back = 1;// empty string
        int one_back = s.charAt(0) == '0' ? 0 : 1;// first char
        int curr = 0;

        for (int i = 2; i <= s.length(); i++) {
            curr = 0;
            if (s.charAt(i - 1) != '0') {
                curr += one_back;
            }

            int num = Integer.parseInt(s.substring(i - 2, i));
            if (s.charAt(i - 2) != '0' && num <= 26) {
                curr += two_back;
            }

            two_back = one_back;
            one_back = curr;
        }
        return curr;
    }
}
