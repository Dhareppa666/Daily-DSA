package main.finale.DSA.recursion;

import java.util.HashSet;

public class PermutaionOfGivenString {

//    private static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generatePermutation(str, 0, str.length() - 1);
//        System.out.println();
//        System.out.println(set);
    }

    public static void generatePermutation(String str, int left, int right) {
        if (left == right) {
//            set.add(str);
            System.out.print(str + " ");
            return;
        } else {
            for (int i = left; i <= right; i++) {//O(n*n!)
                str = swapString(str, left, i);
                generatePermutation(str, left + 1, right);
                str = swapString(str, left, i);
            }
        }
    }

    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char temp = b[i];
        b[i] = b[j];
        b[j] = temp;
        return String.valueOf(b);
    }

}
