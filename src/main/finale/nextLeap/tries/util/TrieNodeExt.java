package main.finale.nextLeap.tries.util;

public class TrieNodeExt {
    public TrieNodeExt childern[];
    public int wordCount;
    public int prefixCount;

    public TrieNodeExt() {
        childern = new TrieNodeExt[26];
        wordCount = 0;
        prefixCount = 0;
    }
}
