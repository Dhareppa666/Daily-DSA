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
        // Step 1: Fill the leaves (second half of the tree array)
        // Leaves start from index n and go to 2n-1
        // These are the original array elements
        for (int i = n, j = 0; i < 2 * n; i++, j++) {
            tree[i] = nums[j];
        }
        
        // Step 2: Build the internal nodes (first half of the tree array)
        // We process nodes from the last internal node to the root (index 1)
        // For each internal node, its value is the sum of its two children
        for (int i = n - 1; i > 0; i--) {
            // Left child is at 2*i, right child at 2*i + 1
            tree[i] = tree[i * 2] + tree[i * 2 + 1];
        }
    }

    /**
     * Updates the value at the specified index in the original array.
     * 
     * @param index The index in the original array to update (0-based)
     * @param val   The new value
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public void update(int index, int val) {
        // Convert the array index to the corresponding leaf node index
        index += n;
        
        // Update the leaf node with the new value
        tree[index] = val;
        
        // Propagate the change up the tree
        while (index > 1) {
            // Move to parent
            index /= 2;
            
            // The current node's value is the sum of its two children
            // Left child is at 2*index, right child at 2*index + 1
            tree[index] = tree[2 * index] + tree[2 * index + 1];
        }
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
        // Convert to leaf node indices
        left += n;
        right += n;
        
        int sum = 0;
        
        // We process the range by moving up the tree
        while (left <= right) {
            // If left is a right child, it means its parent includes elements outside our range
            // So we add it to the sum and move right
            if (left % 2 == 1) {
                sum += tree[left];
                left++;
            }
            
            // If right is a left child, it means its parent includes elements outside our range
            // So we add it to the sum and move left
            if (right % 2 == 0) {
                sum += tree[right];
                right--;
            }
            
            // Move up to the parent level
            left /= 2;
            right /= 2;
        }
        
        return sum;
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
