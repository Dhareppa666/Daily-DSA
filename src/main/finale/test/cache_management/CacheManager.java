package main.finale.test.cache_management;

import main.finale.test.cache_management.strategies.CacheStrategies;

import java.util.HashMap;
import java.util.Map;

public class CacheManager<K, V> {

    Map<String, Cache> listOfCaches = new HashMap<>();

    private CacheManager() {
    }

    private static CacheManager INSTANCE;

    public static CacheManager getCacheManager() {
        if (INSTANCE == null) {
            INSTANCE = new CacheManager();
        }
        return INSTANCE;
    }

    public void createCache(String name, CacheStrategies strategy, int capacity) {
        if (listOfCaches.get(name) == null) {
            Cache cache = new Cache(name, strategy, capacity);
            listOfCaches.put(name, cache);
        }
    }

    public void set(String cacheName, K key, V value) {
        if(listOfCaches.get(cacheName) == null) {
            return;
        } else {
            listOfCaches.get(cacheName).cacheMap.put(key, value);
            listOfCaches.get(cacheName).accessed(key);
        }
    }

    public Object get(String cacheName, K key) {
        if(listOfCaches.get(cacheName) == null) {
            return null;
        }
        listOfCaches.get(cacheName).accessed(key);
        return listOfCaches.get(cacheName).cacheMap.get(key);
    }
}
