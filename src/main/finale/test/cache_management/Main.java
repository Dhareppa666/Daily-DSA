package main.finale.test.cache_management;

import main.finale.test.cache_management.strategies.LRUCacheStrategy;

public class Main {
    public static void main(String[] args) {
        CacheManager manager = CacheManager.getCacheManager();

        manager.createCache("c1", new LRUCacheStrategy(3), 3);

        manager.set("c1", "key1", "value1");
        manager.set("c1", "key2", "value2");

        Object o = manager.get("c1", "key1");
        System.out.println(o);

        Object o2 = manager.get("c2", "key1");
        System.out.println(o2);
    }
}
