package main.finale.System_Design.LLD.CWA;

public interface DBStorage<K, V> {
    void write(K key, V value) throws Exception;
    V read(K key) throws Exception;
    void delete(K key) throws Exception;
}
