package main.finale.leetcode.Daily;

import java.util.*;

public class _1647_Minimum_Deletions_to_Make_Character_Frequencies_Unique {

    public static void main(String[] args) {
        int res = minDeletions("aaabbbcc");
        System.out.println(res);
    }

    public static int minDeletions(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Character,Integer> map1 : map.entrySet()) {
            int x = map1.getValue();
            while(set.contains(x)) {
                res++;
                x--;
//                set.add(x);
            }
            set.add(x);
        }
        return res;
    }

    public static int minDeletions2(String s) {
        int res = 0;
        int[] freq = new int[26];
        for(char c: s.toCharArray()) {
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        for(int i=24; i>=0; i--) {
            if(freq[i] == 0 ) {
                break;
            }

            if(freq[i] >= freq[i+1]) {
                int prev = freq[i];
                freq[i] = Math.max(0, freq[i+1]-1);
                res+= prev-freq[i];
            }
        }
        return res;
    }
}
