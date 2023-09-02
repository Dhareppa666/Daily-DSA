package main.finale.In_Walmart.nextLeap.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Anagrams {

    public static void main(String[] args) {
//        List<Integer> list = findAnagrams("cbaebabacd", "abc");
        List<Integer> list = findAnagrams("abab", "ab");
        System.out.println(list);

        System.out.println(7&1);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        // Your code goes here
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        List<Integer> list = new ArrayList<>();

        if(s.length()<p.length()) {
            return list;
        }
        for(int i=0; i<p.length(); i++) {
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }
        int start = 0, end = p.length();
        if(Arrays.equals(freq1, freq2)){
            list.add(start);
        }

        while(end < s.length()) {
            freq1[s.charAt(start)-'a']--;
            freq1[s.charAt(end)-'a']++;

            if(Arrays.equals(freq1, freq2)){
                list.add(start+1);
            }
            start++;
            end++;
        }
        return list;
    }
}
