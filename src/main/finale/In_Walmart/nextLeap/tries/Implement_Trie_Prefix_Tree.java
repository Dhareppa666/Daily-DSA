package main.finale.In_Walmart.nextLeap.tries;

class Implement_Trie_Prefix_Tree {
    TrieNode root;

    public Implement_Trie_Prefix_Tree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        // Your code goes here
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }


    public boolean startsWith(String word) {
        // Your code goes here
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return dfs(node);
    }

    public boolean dfs(TrieNode node) {
        if (node.isEndOfWord) {
            return true;
        }
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                return dfs(node.children[i]);
            }
        }
        return false;
    }
}
