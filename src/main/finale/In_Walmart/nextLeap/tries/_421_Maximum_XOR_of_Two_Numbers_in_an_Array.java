package main.finale.In_Walmart.nextLeap.tries;

public class _421_Maximum_XOR_of_Two_Numbers_in_an_Array {

    class TrieNode {
        TrieNode[] children;

        public TrieNode() {
            this.children = new TrieNode[2];
        }
    }

    TrieNode root;

    public int findMaximumXOR(int[] nums) {
        root = new TrieNode();
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i], root);
        }

        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = Math.max(getXor(nums[i], root), xor);
        }
        return xor;
    }

    public int getXor(int num, TrieNode root) {
        int res = 0;
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int curBit = ((1 << i) & num) > 0 ? 1 : 0;
            if (node.children[curBit ^ 1] != null) {
                res += (1 << i);
                node = node.children[curBit ^ 1];
            } else {
                node = node.children[curBit];
            }
        }
        return res;
    }

    public void insert(int num, TrieNode root) {
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int currBit = ((1 << i) & num) > 0 ? 1 : 0;
            if (node.children[currBit] == null) {
                node.children[currBit] = new TrieNode();
            }
            node = node.children[currBit];
        }
    }
}