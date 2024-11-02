package main.finale.test.cache_management;

import main.finale.test.cache_management.strategies.CacheStrategies;

import java.util.HashMap;
import java.util.Map;

public class Cache<K, V> {

    String name;
    CacheStrategies cacheStrategies;

    Map<K, V> cacheMap;

    public Cache(String name, CacheStrategies cacheStrategies, int capacity) {
        this.name = name;
        this.cacheStrategies = cacheStrategies;
        this.cacheMap = new HashMap<>(capacity);
    }


    public void evict(K key) {
        cacheStrategies.evict(key);
    }

    public void accessed(K key) {
        cacheStrategies.accessed(key);
    }
}
