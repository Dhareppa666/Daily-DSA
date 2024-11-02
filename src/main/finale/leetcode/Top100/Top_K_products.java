package main.finale.leetcode.Top100;

import java.util.*;

// Data structures and algorithms: create a method to
// return the k most frequent products that were purchased in the last hour
public class Top_K_products {

    private static class Purchase {
        String productID;
        long timestamp;

        public Purchase(String productID, long timestamp) {
            this.productID = productID;
            this.timestamp = timestamp;
        }
    }

    private LinkedList<Purchase> purchaseLog; // Log to store product purchases with timestamps
    private Map<String, Integer> frequencyMap; // Frequency of each product
    private static final long ONE_HOUR = 3600000; // One hour in milliseconds

    public Top_K_products() {
        this.purchaseLog = new LinkedList<>();
        this.frequencyMap = new HashMap<>();
    }

    // Simulate a product purchase
    public void purchaseProduct(String productID) {
        long currentTime = System.currentTimeMillis();
        Purchase purchase = new Purchase(productID, currentTime);
        purchaseLog.add(purchase);
        frequencyMap.put(productID, frequencyMap.getOrDefault(productID, 0) + 1);
    }

    // Get the top K most frequent products in the last hour
    public List<String> getTopKFrequentProducts(int k) {
        long currentTime = System.currentTimeMillis();

        // Step 1: Remove purchases older than one hour
        while (!purchaseLog.isEmpty() && currentTime - purchaseLog.peekFirst().timestamp > ONE_HOUR) {
            Purchase oldPurchase = purchaseLog.pollFirst();
            String productID = oldPurchase.productID;
            frequencyMap.put(productID, frequencyMap.get(productID) - 1);
            if (frequencyMap.get(productID) == 0) {
                frequencyMap.remove(productID);
            }
        }

        // Step 2: Use a min-heap to keep track of the top K frequent products
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 3: Extract the top K products from the heap
        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

        // Since the heap returns elements in ascending order, reverse to get descending order
        Collections.reverse(result);
        return result;
    }


}
