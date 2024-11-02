package main.finale.leetcode.Top100;

import java.util.HashMap;

class LRUCache {
    private final int capacity;
    private final HashMap<Integer, Node> map;
    private final DoublyLinkedList dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.dll = new DoublyLinkedList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1; // Cache miss
        }

        Node node = map.get(key);
        dll.moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            dll.moveToHead(node);
        } else {
            if (map.size() >= capacity) {
                Node tail = dll.removeTail();
                map.remove(tail.key);
            }

            Node newNode = new Node(key, value);
            dll.addToHead(newNode);
            map.put(key, newNode);
        }
    }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class DoublyLinkedList {
        private final Node head;
        private final Node tail;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        void addToHead(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        void moveToHead(Node node) {
            removeNode(node);
            addToHead(node);
        }

        Node removeTail() {
            Node node = tail.prev;
            removeNode(node);
            return node;
        }
    }

//    Customer Obsession
//    Ownership
//    Learn and Be Curious
//    Think Big
//    Earn Trust
//    Dive Deep
//    Deliver Results

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // returns 1
        cache.put(3, 3);                  // evicts key 2
        System.out.println(cache.get(2)); // returns -1 (not found)
        cache.put(4, 4);                  // evicts key 1
        System.out.println(cache.get(1)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4)); // returns 4
    }
}
