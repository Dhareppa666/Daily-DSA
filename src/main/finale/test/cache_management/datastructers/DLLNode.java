package main.finale.test.cache_management.datastructers;

public class DLLNode<K> {

    K value;

    DLLNode<K> next;
    DLLNode<K> prev;

    public DLLNode(K value) {
        this.value = value;
    }

}
