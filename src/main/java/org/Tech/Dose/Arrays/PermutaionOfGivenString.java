package org.Tech.Dose.Arrays;

public class PermutaionOfGivenString {

    //Function for swapping the characters at position I with character at position j
    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char temp = b[i];
        b[i] = b[j];
        b[j] = temp;
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generatePermutation(str, "");
    }

    //Function for generating different permutations of the string
    public static void generatePermutation(String str, String ans) {
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            // ith character of str
            char ch = str.charAt(i);
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);
            // Recurvise call
            generatePermutation(ros, ans + ch);
        }
    }
}
