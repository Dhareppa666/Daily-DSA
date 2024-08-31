package main.finale.leetcode.Weekly;

//Given a string s, return the maximum length of a substring,
// such that it contains at most two occurrences of each character.
public class _3090_Maximum_Length_Substring_With_Two_Occurrences {

    public static void main(String[] args) {
        int maxNum = maximumLengthSubstring2("bcbbbcba");// o/p: 4
        System.out.println(maxNum);
    }

    public static int maximumLengthSubstring(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char[] data = new char[26];
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                data[s.charAt(j) - 'a']++;
                if (data[s.charAt(j) - 'a'] > 2) {
                    break;
                }
                count++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static int maximumLengthSubstring2(String s) {
        int left = 0, right = 0, len = s.length() - 1;
        int ans = 0;
        char[] freq = new char[26];
        while (right <= len) {
            freq[s.charAt(right) - 'a']++;
            while (freq[s.charAt(right) - 'a'] > 2 && left < right) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }

        return ans;
    }
}
