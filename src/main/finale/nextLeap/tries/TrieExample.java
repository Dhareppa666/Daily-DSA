package main.finale.nextLeap.tries;

import main.finale.In_Walmart.nextLeap.tries.util.TrieNode;

import java.util.*;

public class TrieExample {
    TrieNode root;

    TrieExample() {
        root = new TrieNode();
    }

    public static void main(String[] args) {
        TrieExample trie = new TrieExample();

        // Inserting words into the trie
        trie.insert("apple");
        trie.insert("banana");
        trie.insert("orange");
        trie.insert("grape");
        trie.insert("app");
        trie.insert("appreciate");

        // Searching for words in the trie
        System.out.println("Inserted 6 words");

        System.out.println("Is 'apple' present in the trie? " + trie.search("apple")); // Should return true
        System.out.println("Is 'orange' present in the trie? " + trie.search("orange")); // Should return true
        System.out.println("Is 'pear' present in the trie? " + trie.search("pear")); // Should return false
        System.out.println("Is 'grapefruit' present in the trie? " + trie.search("grapefruit")); // Should return false

        List<String> listOfPrefix = trie.prefixSearch("ap");
        System.out.println(listOfPrefix);

        // Deleting words from the trie
        trie.delete("apple");
        trie.delete("orange");

        System.out.println("Is 'apple' present in the trie after deletion? " + trie.search("apple")); // Should return false
        System.out.println("Is 'orange' present in the trie after deletion? " + trie.search("orange")); // Should return false
    }

    boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    List<String> prefixSearch(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return Collections.emptyList();
            }
            node = node.children[index];
        }
        List<String> result = new ArrayList<>();
        dfs(node, new StringBuilder(prefix), result);
        return result;
    }

    private void dfs(TrieNode node, StringBuilder currentWord, List<String> result) {
        if (node.isEndOfWord) {
            result.add(currentWord.toString());
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = ch - 'a';
            if (node.children[index] != null) {
                currentWord.append(ch);
                dfs(node.children[index], currentWord, result);
                currentWord.deleteCharAt(currentWord.length() - 1);
                // We are deleting this bcz in continuation of loop, we want to remove what we have added earlier.
            }
        }
    }

    void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    boolean delete(String word) {
        return deleteRec(root, word, 0);
    }

    private boolean deleteRec(TrieNode node, String word, int index) {
        if (index == word.length()) {
            if (!node.isEndOfWord) {
                return false; // Word not found
            }
            node.isEndOfWord = false;
            return isEmptyNode(node);
        }

        char ch = word.charAt(index);
        int charIndex = ch - 'a';
        TrieNode child = node.children[charIndex];

        if (child == null) {
            return false; // Word not found
        }

        boolean shouldDeleteChild = deleteRec(child, word, index + 1);
        if (shouldDeleteChild) {
            node.children[charIndex] = null;
            return isEmptyNode(node);
        }

        return false;
    }

    private boolean isEmptyNode(TrieNode node) {
        for (TrieNode child : node.children) {
            if (child != null) {
                return false;
            }
        }
        return true;
    }
}
