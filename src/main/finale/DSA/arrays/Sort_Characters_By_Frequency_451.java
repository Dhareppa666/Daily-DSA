package main.finale.DSA.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort_Characters_By_Frequency_451 {

    public static void main(String[] args) {
//        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort2("tree"));
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Character>[] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >= 0; pos--)
            if (bucket[pos] != null)
                for (char c : bucket[pos])
                    for (int i = 0; i < pos; i++)
                        sb.append(c);

        return sb.toString();
    }

    // Works only if we have range as 26.
    public static String frequencySort2(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++) {
            int temp = freq[s.charAt(i)-'a'];
            freq[s.charAt(i)-'a'] = ++temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                for(int j=0; j<freq[i]; j++){
                    sb.append((char)(i+'a'));
                }
            }
        }
        return sb.toString();
    }
}
