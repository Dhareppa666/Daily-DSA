package main.finale.In_Walmart.nextLeap.HeapAndQueue;

import java.util.PriorityQueue;

// Input:
// ["KthLargest", "add", "add", "add", "add", "add"]
// [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
// Output:
// [null,4, 5, 5, 8, 8]
// Explanation: KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);

public class Kth_Largest_Element_in_a_Stream {

    PriorityQueue<Integer> minHeap;
    int k;

    public Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);
        for (int x = 0; x < nums.length; x++) {
            add(nums[x]);
        }
    }

    public int add(int val) {
        // Your code goes here
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (minHeap.peek() < val) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}
