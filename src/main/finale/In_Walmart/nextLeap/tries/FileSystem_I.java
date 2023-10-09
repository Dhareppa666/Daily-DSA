package main.finale.In_Walmart.nextLeap.tries;

import java.util.*;

//Using Tries
class FileSystem_I {

    // The TrieNode data structure.
    class TrieNode {

        String name;
        int val = -1;
        Map<String, TrieNode> map = new HashMap<>();

        TrieNode(String name) {
            this.name = name;
        }
    }

    TrieNode root;

    // Root node contains the empty string.
    public FileSystem_I() {
        this.root = new TrieNode("");
    }

    public boolean createPath(String path, int value) {

        // Obtain all the components
        String[] components = path.split("/");

        // Start "curr" from the root node.
        TrieNode cur = root;

        // Iterate over all the components.
        for (int i = 1; i < components.length; i++) {

            String currentComponent = components[i];

            // For each component, we check if it exists in the current node's dictionary.
            if (!cur.map.containsKey(currentComponent)) {

                // If it doesn't and it is the last node, add it to the Trie.
                if (i == components.length - 1) {
                    cur.map.put(currentComponent, new TrieNode(currentComponent));
                } else {
                    return false;
                }
            }

            cur = cur.map.get(currentComponent);
        }

        // Value not equal to -1 means the path already exists in the trie.
        if (cur.val != -1) {
            return false;
        }

        cur.val = value;
        return true;
    }

    public int get(String path) {

        // Obtain all the components
        String[] components = path.split("/");

        // Start "curr" from the root node.
        TrieNode cur = root;

        // Iterate over all the components.
        for (int i = 1; i < components.length; i++) {

            String currentComponent = components[i];

            // For each component, we check if it exists in the current node's dictionary.
            if (!cur.map.containsKey(currentComponent)) {
                return -1;
            }

            cur = cur.map.get(currentComponent);
        }

        return cur.val;
    }
}