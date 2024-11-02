package main.finale.test.cache_management.datastructers;

import java.util.Map;

public class DLL<K, V> {
    DLLNode<K> head;
    DLLNode<K> tail;

    public DLL(){
       head = new DLLNode<>(null);
       tail = new DLLNode<>(null);
       head.next = tail;
       tail.prev = head;
    }

    public void removeTail() {
        DLLNode<K> prev = tail.prev;
        DLLNode<K> prevPrev = prev.prev;
        DLLNode<K> prevNext = tail;
        prevPrev.next = prevNext;
        prevNext.prev = prevPrev;
        prev.next = null;
        prev.prev = null;

    }

    public void addToHead() {

    }

    public void moveToHead(K key) {
        DLLNode<K> newNode = new DLLNode<>(key);

        DLLNode<K> next = head.next;
        next.prev = newNode;
        newNode.next = next;
        newNode.prev = head;

        head.next = newNode;
    }

}
