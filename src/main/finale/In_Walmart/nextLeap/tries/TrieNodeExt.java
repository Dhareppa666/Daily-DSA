package main.finale.In_Walmart.nextLeap.tries;

class TrieNodeExt {
    public TrieNodeExt childern[];
    public int wordCount;
    public int prefixCount;

    TrieNodeExt() {
        childern = new TrieNodeExt[26];
        wordCount = 0;
        prefixCount = 0;
    }
}
