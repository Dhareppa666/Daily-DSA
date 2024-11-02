package main.finale.test.cache_management.strategies;

public interface CacheStrategies<K, V> {

    void evict(K key);

    void accessed(K key);
}
