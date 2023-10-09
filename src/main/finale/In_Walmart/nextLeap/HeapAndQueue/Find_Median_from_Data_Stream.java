package main.finale.In_Walmart.nextLeap.HeapAndQueue;

import java.util.*;

class Find_Median_from_Data_Stream {

    public PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

    public Find_Median_from_Data_Stream() {

    }

    public void addNum(int num) {
        if (maxHeap.size() == 0 || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        // After adding the elements its important to balance out the heaps
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        // Your code goes here
        if (minHeap.size() == maxHeap.size()) {
            return (minHeap.peek() / 2.0) + (maxHeap.peek() / 2.0);
        } else {
            return maxHeap.peek();
        }
    }
}