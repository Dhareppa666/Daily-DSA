package main.finale.In_Walmart.nextLeap.strings;

public class repeated_substring_pattern {

    public static void main(String[] args) {
        boolean isRepeated = repeatedSubstringPattern("abcabcabcabcae");
        System.out.println(isRepeated);
    }

    public static boolean repeatedSubstringPattern(String str) {
        int length = str.length();
        for (int i = length / 2; i >= 1; i--) {
            if (length % i == 0) {
                int m = length / i;
                String subS = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
