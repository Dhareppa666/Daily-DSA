package main.finale.DSA_Through_C.trees;

public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }
    }

    public Node root;

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);

    }

    private void insert(int data) {
        Node newNode = new Node(data);
    }
}
