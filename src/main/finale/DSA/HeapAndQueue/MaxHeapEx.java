package main.finale.DSA.HeapAndQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

class MaxHeap {
    private List<Integer> heap;

    MaxHeap() {
        heap = new ArrayList<>();
    }

    void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    int extractMax() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty.");
        }
        int max = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return max;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(parentIndex) < heap.get(index)) {
                Collections.swap(heap, parentIndex, index);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int leftChildIdx = 2 * index + 1;
            int rightChildIdx = 2 * index + 2;
            int largestIdx = index;

            if (leftChildIdx < size && heap.get(leftChildIdx) > heap.get(largestIdx)) {
                largestIdx = leftChildIdx;
            }

            if (rightChildIdx < size && heap.get(rightChildIdx) > heap.get(largestIdx)) {
                largestIdx = rightChildIdx;
            }

            if (largestIdx != index) {
                Collections.swap(heap, index, largestIdx);
                index = largestIdx;
            } else {
                break;
            }
        }
    }

    int peekMax() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty.");
        }
        return heap.get(0);
    }
}

public class MaxHeapEx {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(30);
        maxHeap.insert(20);
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(8);
        maxHeap.insert(7);

        System.out.println("Max element: " + maxHeap.peekMax()); // Output: 30

        System.out.println("Extracting max element: " + maxHeap.extractMax()); // Output: 30

        System.out.println("Max element after extraction: " + maxHeap.peekMax()); // Output: 20
    }
}

