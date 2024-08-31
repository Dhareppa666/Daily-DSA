package main.finale.leetcode.Weekly.mera;

import java.util.*;

public class _3043_Find_the_Length_of_the_Longest_Common_Prefix {

    public static void main(String[] args) {
        int[] arr1 = {1,10,100}, arr2 = {1000};
        int res = longestCommonPrefix(arr1, arr2);
        System.out.println(res);
    }

    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int val : arr1) {
            String str = String.valueOf(val);
            for (int i = 0; i < str.length(); i++) {
                int curr = Integer.parseInt(str.substring(0, i + 1));
                set.add(curr);
            }
        }

        int ans = 0;
        for (int val : arr2) {
            String str = String.valueOf(val);

            for (int i = ans; i < str.length(); i++) {
                int curr = Integer.parseInt(str.substring(0, i + 1));
                if (set.contains(curr)) {
                    ans = i + 1;
                }
            }
        }
        return ans;
    }

}
