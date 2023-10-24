package main.finale.In_Walmart.nextLeap.tries;

import java.util.HashSet;

//Given a string S return the number of distinct substrings (including empty substring).
//Input: s = "sds"
//Output: 6
//Explanation: 6 distinct substrings are : s, d, sd, ds, sds and empty string.

public class Count_Distinct_Substrings_II {

    class TrieNode {
        public TrieNode[] children = new TrieNode[26];

        TrieNode() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public int countDistinctSubstrings(String s) {
        int n = s.length();

        //    Intialize the root of  the trie.
        TrieNode head = new TrieNode();

        //    Insert all suffixes into the trie.
        for (int i = 0; i < n; i++) {
            insert(s, i, head);
        }

        //    Count the total number of nodes in the trie.
        int totalNodes = countNodes(head);

        //    Return the number of distinct substrings.
        return totalNodes;
    }

    //    Function to insert a string into the trie.
    private void insert(String s, int i, TrieNode head) {
        TrieNode node = head;
        int n = s.length();

        //    Iterate through the given string
        while (i < n) {
            char ch = s.charAt(i);

            //    If child node is not present.
            if (node.children[ch - 'a'] == null) {
                //    Create new child node.
                node.children[ch - 'a'] = new TrieNode();
            }

            //    Move to the child node.
            node = node.children[ch - 'a'];
            i++;
        }
    }

    //    Function to count the number of nodes in the trie.
    private static int countNodes(TrieNode root) {
        if (root == null) {
            return 0;
        }

        int subTreeNodes = 1;

        //    Iterate through the children of the current node.
        for (int i = 0; i < 26; i++) {
            subTreeNodes += countNodes(root.children[i]);
        }

        return subTreeNodes;
    }

}

//Time complexity: O(N2).
//Space Complexity: O(N2)
