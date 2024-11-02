package main.finale.leetcode.Top100;

import java.util.*;

class LFUCache {
    class Node {
        int key, value, frequency;
        Node prev, next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.frequency = 1;
        }
    }

    class DoublyLinkedList {
        Node head, tail;
        int size;

        public DoublyLinkedList() {
            head = new Node(0, 0); // Dummy head
            tail = new Node(0, 0); // Dummy tail
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        public void addNode(Node node) {
            Node nextNode = head.next;
            head.next = node;
            node.prev = head;
            node.next = nextNode;
            nextNode.prev = node;
            size++;
        }

        public void removeNode(Node node) {
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            size--;
        }

        public Node removeLast() {
            if (size > 0) {
                Node lastNode = tail.prev;
                removeNode(lastNode);
                return lastNode;
            }
            return null;
        }
    }

    private int capacity, minFrequency;
    private Map<Integer, Node> keyToNode;
    private Map<Integer, DoublyLinkedList> frequencyToDLL;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 0;
        keyToNode = new HashMap<>();
        frequencyToDLL = new HashMap<>();
    }

    public int get(int key) {
        if (!keyToNode.containsKey(key)) {
            return -1;
        }

        Node node = keyToNode.get(key);
        updateNode(node); // Update frequency and position
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyToNode.containsKey(key)) {
            Node node = keyToNode.get(key);
            node.value = value; // Update value
            updateNode(node);   // Update frequency and position
        } else {
            if (keyToNode.size() >= capacity) {
                // Evict the least frequently used node
                DoublyLinkedList minFreqList = frequencyToDLL.get(minFrequency);
                Node nodeToEvict = minFreqList.removeLast();
                keyToNode.remove(nodeToEvict.key);
            }

            // Add new node
            Node newNode = new Node(key, value);
            keyToNode.put(key, newNode);
            minFrequency = 1; // Reset minFrequency to 1
            frequencyToDLL.computeIfAbsent(1, k -> new DoublyLinkedList()).addNode(newNode);
        }
    }

    private void updateNode(Node node) {
        int oldFreq = node.frequency;
        DoublyLinkedList oldList = frequencyToDLL.get(oldFreq);
        oldList.removeNode(node);

        // If the list of oldFreq is empty and it's the min frequency, update minFrequency
        if (oldList.size == 0 && oldFreq == minFrequency) {
            minFrequency++;
        }

        // Update node's frequency
        node.frequency++;
        frequencyToDLL.computeIfAbsent(node.frequency, k -> new DoublyLinkedList()).addNode(node);
    }
}

