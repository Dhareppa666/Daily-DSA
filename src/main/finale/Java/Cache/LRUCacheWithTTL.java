package main.finale.Java.Cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheWithTTL<K, V> {
    
    // Inner class for the doubly linked list node
    private class Node {
        K key;
        V value;
        Long expiry; // Expiry time in milliseconds since epoch
        Node prev;
        Node next;
        
        public Node(K key, V value, Long expiry) {
            this.key = key;
            this.value = value;
            this.expiry = expiry;
        }
    }
    
    private final int capacity;
    private final Map<K, Node> cache;
    private final Node head; // Dummy head
    private final Node tail; // Dummy tail
    
    public LRUCacheWithTTL(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        
        // Initialize dummy head and tail
        this.head = new Node(null, null, null);
        this.tail = new Node(null, null, null);
        head.next = tail;
        tail.prev = head;
    }
    
    public V get(K key) {
        if (!cache.containsKey(key)) {
            return null;
        }
        
        Node node = cache.get(key);
        
        // Check if the entry has expired
        if (node.expiry != null && System.currentTimeMillis() > node.expiry) {
            // Remove expired node
            removeNode(node);
            cache.remove(key);
            return null;
        }
        
        // Move the accessed node to the front (most recently used)
        moveToHead(node);
        return node.value;
    }
    
    public void put(K key, V value, Long ttlMillis) {
        // Calculate expiry time if TTL is provided
        Long expiry = (ttlMillis != null) ? System.currentTimeMillis() + ttlMillis : null;
        
        if (cache.containsKey(key)) {
            // Update existing node
            Node node = cache.get(key);
            node.value = value;
            node.expiry = expiry;
            moveToHead(node);
        } else {
            // Create new node
            Node newNode = new Node(key, value, expiry);
            cache.put(key, newNode);
            addToFront(newNode);
            
            // Check if we've exceeded capacity
            if (cache.size() > capacity) {
                // Remove the least recently used node (before tail)
                Node toRemove = tail.prev;
                removeNode(toRemove);
                cache.remove(toRemove.key);
            }
        }
    }
    
    public void cleanup() {
        // Start from the tail (LRU) and move towards head
        Node current = tail.prev;
        long currentTime = System.currentTimeMillis();
        
        while (current != head) {
            Node prevNode = current.prev;
            
            // If the node has expired, remove it
            if (current.expiry != null && currentTime > current.expiry) {
                removeNode(current);
                cache.remove(current.key);
            }
            
            current = prevNode;
        }
    }
    
    // Helper method to add a node right after the head
    private void addToFront(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    
    // Helper method to remove a node from the list
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    // Helper method to move a node to the front of the list
    private void moveToHead(Node node) {
        removeNode(node);
        addToFront(node);
    }
    
    // For testing purposes
    public int size() {
        return cache.size();
    }
}
