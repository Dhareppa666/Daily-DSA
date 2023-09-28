package main.finale.In_Walmart.LC.Daily;

import java.util.Stack;

//Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is
//the smallest in lexicographical order among all possible results.
public class _316_Remove_Duplicate_Letters {

    public static void main(String[] args) {
        String s = "bcabc";
        String res = removeDuplicates(s);
        System.out.println(res);
    }

    public static String removeDuplicates(String s ) {
        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26];
        char[] freq = new char[26];

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            freq[c-'a']++;
        }

        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            freq[curr-'a']--;
            if(visited[curr-'a']) continue;

            while (stack.size()>0 && stack.peek() > curr && freq[stack.peek()-'a'] >0) {
                char c = stack.pop();
                visited[c-'a'] = false;
            }
            stack.push(curr);
            visited[curr-'a'] = true;
        }

        char[] res = new char[stack.size()];
        int index = res.length;
        while (!stack.isEmpty()) {
            res[--index] = stack.pop();
        }

        return new String(res);
    }
}
