package main.finale.In_Walmart.nextLeap.trees;

public class Array_Representation {
    public static void main(String[] args) {
        int[] values = {10, 5, 20, 3, 8, 15, 25};
        ArrayBinaryTree tree = new ArrayBinaryTree(values);

        System.out.println("Root: " + tree.getRoot()); // Output: Root: 10
        System.out.println("Left child of 5: " + tree.getLeftChild(1)); // Output: Left child of 5: 3
        System.out.println("Right child of 5: " + tree.getRightChild(1)); // Output: Right child of 5: 8
    }
}

class ArrayBinaryTree {
    private int[] arr;

    public ArrayBinaryTree(int[] values) {
        arr = values;
    }

    public int getRoot() {
        return arr[0];
    }

    public int getLeftChild(int index) {
        int leftIndex = 2 * index + 1;
        if (leftIndex >= arr.length || arr[leftIndex] == -1) {
            return -1;
        }
        return arr[leftIndex];
    }

    public int getRightChild(int index) {
        int rightIndex = 2 * index + 2;
        if (rightIndex >= arr.length || arr[rightIndex] == -1) {
            return -1;
        }
        return arr[rightIndex];
    }
}

