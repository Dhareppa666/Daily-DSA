package main.finale.leetcode.Top100;

import java.util.*;

public class _17_Letter_Combinations_of_a_Phone_Number {

    public static void main(String[] args) {
        List<String> combinations = letterCombinations("23");
        System.out.println(combinations);
        System.out.println(combinations.size());
    }

    public static List<String> letterCombinations(String digits) {
        Queue<String> queue = new LinkedList<>();
        if (digits.isEmpty()) {
            return (List<String>) queue;
        }
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        queue.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            int queueLen = queue.size();
            int count = 1;
            while (count <= queueLen) {
                String t = queue.poll();
                for (char c : mapping[x].toCharArray()) {
                    queue.add(t + c);
                }
                count++;
            }
        }
        return (List<String>) queue;
    }

    public static List<String> letterCombinations2(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) return ans;
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        while (ans.peek().length() != digits.length()) {
            String remove = ans.remove();
            String map = mapping[digits.charAt(remove.length()) - '0'];
            for (char c : map.toCharArray()) {
                ans.addLast(remove + c);
            }
        }
        return ans;
    }
}
