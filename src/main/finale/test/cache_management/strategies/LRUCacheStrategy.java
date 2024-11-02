package main.finale.test.cache_management.strategies;

import main.finale.test.cache_management.datastructers.DLL;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheStrategy<K, V> implements CacheStrategies<K, V> {

    Map<K, DLL<K,V>> map;

    DLL<K, V> dll;

    int capacity;

    public LRUCacheStrategy(int capacity) {
        dll = new DLL<>();
        this.map = new HashMap<>(capacity);
    }


    @Override
    public void evict(K key) {
//        if(capacity>dll.capacity) {
//            dll.removeTail();
//            capacity--;
//        }
        dll.removeTail();
        capacity--;
    }

    @Override
    public void accessed(K key) {
        dll.moveToHead(key);
    }
}
