package main.finale.Java.SegmentTree;

/**
 * Implementation of a Segment Tree that supports range sum queries and point updates.
 * A segment tree is a tree data structure used for storing information about intervals (segments).
 * It allows querying which of the stored segments contain a given point in O(log n) time.
 * 
 * This implementation is specifically for range sum queries, but can be modified for other
 * associative operations like minimum, maximum, etc.
 */
public class RangeSumSegmentTree {
    // The underlying array that represents the segment tree
    // The tree is represented as an array where:
    // - The root is at index 1
    // - For any node at index i:
    //   - Left child is at 2*i
    //   - Right child is at 2*i + 1
    private int[] tree;
    
    // The size of the original array
    private int n;

    /**
     * Constructs a segment tree from the given array.
     * 
     * @param nums The input array from which to build the segment tree.
     *             If the array is empty, the segment tree will be empty.
     */
    public RangeSumSegmentTree(int[] nums) {
        if (nums.length > 0) {
            n = nums.length;
            // We need 2n space because:
            // - First n-1 elements are internal nodes
            // - Last n elements are leaves (original array elements)
            tree = new int[n * 2];
            buildTree(nums);
        }
    }

    /**
     * Builds the segment tree from the input array.
     * 
     * @param nums The input array containing the leaf nodes
     */
    private void buildTree(int[] nums) {
        // First, fill the leaf nodes (second half of the tree array)
        for (int i = 0; i < n; i++) {
            tree[n + i] = nums[i];
        }
        // Then build the internal nodes recursively
        buildTree(1, 0, n - 1);
    }
    
    /**
     * Recursively builds the segment tree nodes.
     * 
     * @param node The current node index in the tree
     * @param start The start index in the original array
     * @param end The end index in the original array
     */
    private void buildTree(int node, int start, int end) {
        if (start == end) {
            // Leaf node
            return;
        }
        
        int mid = start + (end - start) / 2;
        int leftChild = 2 * node;
        int rightChild = 2 * node + 1;
        
        // Recursively build left and right subtrees
        buildTree(leftChild, start, mid);
        buildTree(rightChild, mid + 1, end);
        
        // Current node's value is the sum of its children
        tree[node] = tree[leftChild] + tree[rightChild];
    }

    /**
     * Updates the value at the specified index in the original array.
     * 
     * @param index The index in the original array to update (0-based)
     * @param val   The new value
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public void update(int index, int val) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        update(1, 0, n - 1, index, val);
    }
    
    /**
     * Recursively updates the value at the specified index.
     * 
     * @param node  The current node index in the tree
     * @param start The start index of the current segment
     * @param end   The end index of the current segment
     * @param index The index in the original array to update
     * @param val   The new value
     */
    private void update(int node, int start, int end, int index, int val) {
        // Base case: leaf node
        if (start == end) {
            tree[node] = val;
            return;
        }
        
        int mid = start + (end - start) / 2;
        int leftChild = 2 * node;
        int rightChild = 2 * node + 1;
        
        // Recursively update the appropriate child
        if (index <= mid) {
            update(leftChild, start, mid, index, val);
        } else {
            update(rightChild, mid + 1, end, index, val);
        }
        
        // Update current node with the sum of its children
        tree[node] = tree[leftChild] + tree[rightChild];
    }

    /**
     * Returns the sum of elements in the range [left, right] in the original array.
     * 
     * @param left  The left bound of the range (0-based, inclusive)
     * @param right The right bound of the range (0-based, inclusive)
     * @return The sum of elements in the range [left, right]
     * @throws IllegalArgumentException if left > right or indices are out of bounds
     */
    public int rangeSum(int left, int right) {
        if (left < 0 || right >= n || left > right) {
            throw new IllegalArgumentException("Invalid range [" + left + ", " + right + "]");
        }
        return rangeSum(1, 0, n - 1, left, right);
    }
    
    /**
     * Recursively calculates the sum of elements in the range [left, right].
     * 
     * @param node  The current node index in the tree
     * @param start The start index of the current segment
     * @param end   The end index of the current segment
     * @param left  The left bound of the query range
     * @param right The right bound of the query range
     * @return The sum of elements in the range [left, right]
     */
    private int rangeSum(int node, int start, int end, int left, int right) {
        // If the current segment is completely outside the query range
        if (end < left || start > right) {
            return 0;
        }
        
        // If the current segment is completely within the query range
        if (left <= start && end <= right) {
            return tree[node];
        }
        
        // If the current segment partially overlaps with the query range
        int mid = start + (end - start) / 2;
        int leftSum = rangeSum(2 * node, start, mid, left, right);
        int rightSum = rangeSum(2 * node + 1, mid + 1, end, left, right);
        
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        // Initialize the array
        int[] nums = {1, 3, 5, 7, 9, 11};
        
        // Create a segment tree from the array
        RangeSumSegmentTree st = new RangeSumSegmentTree(nums);
        
        // Print the initial array
        System.out.println("Initial array: [1, 3, 5, 7, 9, 11]");
        
        // Test 1: Range sum queries on the original array
        System.out.println("\n--- Testing Range Sum Queries ---");
        System.out.println("Sum of range (0, 3): " + st.rangeSum(0, 3) + " (Expected: 16 = 1+3+5+7)");
        System.out.println("Sum of range (2, 5): " + st.rangeSum(2, 5) + " (Expected: 32 = 5+7+9+11)");
        System.out.println("Sum of range (1, 1): " + st.rangeSum(1, 1) + " (Expected: 3 = 3)");
        
        // Test 2: Update a value and test range sums
        System.out.println("\n--- Testing Update Operation ---");
        System.out.println("Updating value at index 2 from 5 to 10");
        st.update(2, 10);
        
        System.out.println("\n--- Testing Range Sum Queries After Update ---");
        System.out.println("New sum of range (0, 3): " + st.rangeSum(0, 3) + " (Expected: 21 = 1+3+10+7)");
        System.out.println("New sum of range (2, 5): " + st.rangeSum(2, 5) + " (Expected: 37 = 10+7+9+11)");
        
        // Test 3: Single element range
        System.out.println("\n--- Testing Single Element Range ---");
        System.out.println("Sum of range (4, 4): " + st.rangeSum(4, 4) + " (Expected: 9)");
        
        // Test 4: Full range
        System.out.println("\n--- Testing Full Range ---");
        System.out.println("Sum of full array (0, 5): " + st.rangeSum(0, 5) + " (Expected: 41 = 1+3+10+7+9+11)");
    }
}
