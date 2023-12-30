package main.finale.DSA.tries;

//14. Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

//Input: strs = ["flower","flow","flight"]
//Output: "fl"

public class Longest_Common_Prefix {

    class TrieNode {
        boolean isEndOfWord;
        TrieNode[] children;
        int count;

        public TrieNode() {
            this.isEndOfWord = false;
            this.children = new TrieNode[26];
            this.count = 0;
        }
    }

    TrieNode root;

    public String longestCommonPrefix(String[] strs) {
        // Your code goes here
        root = new TrieNode();
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            insert(strs[i]);
            minLength = Math.min(minLength, strs[i].length());
        }
        return getCount(strs.length, root, minLength, new StringBuilder());
    }

    public String getCount(int len, TrieNode root, int minLength, StringBuilder sb) {
        TrieNode node = root;
        for (int i = 1; i <= len; i++) {
            for (int index = 0; index < 26; index++) {
                if (node.children[index] != null) {
                    if (node.children[index].count != len) {
                        return sb.toString();
                    } else {
                        sb.append((char) ('a' + index));
                        node = node.children[index];
                        continue;
                    }
                }
            }
        }
        return sb.toString();
    }

    public void insert(String s) {
        TrieNode node = root;
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node.children[index].count++;
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }
}