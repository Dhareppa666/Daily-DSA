package main.intvs.int2023_24.Amazon.Oct;


public class Round_04 {

    // https://leetcode.com/problems/boundary-of-binary-tree/description/
    // https://leetcode.ca/all/545.html
    // https://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/
    //Boundary Traversal of binary tree

    static class Node {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        // A simple function to print leaf nodes of a binary tree
        void printLeaves(Node node)
        {
            if (node == null)
                return;

            printLeaves(node.left);
            // Print it if it is a leaf node
            if (node.left == null && node.right == null)
                System.out.print(node.data + " ");
            printLeaves(node.right);
        }

        // A function to print all left boundary nodes, except a leaf node.
        // Print the nodes in TOP DOWN manner
        void printBoundaryLeft(Node node)
        {
            if (node == null)
                return;

            if (node.left != null) {
                // to ensure top down order, print the node
                // before calling itself for left subtree
                System.out.print(node.data + " ");
                printBoundaryLeft(node.left);
            }
            else if (node.right != null) {
                System.out.print(node.data + " ");
                printBoundaryLeft(node.right);
            }

            // do nothing if it is a leaf node, this way we avoid
            // duplicates in output
        }

        // A function to print all right boundary nodes, except a leaf node
        // Print the nodes in BOTTOM UP manner
        void printBoundaryRight(Node node)
        {
            if (node == null)
                return;

            if (node.right != null) {
                // to ensure bottom up order, first call for right
                // subtree, then print this node
                printBoundaryRight(node.right);
                System.out.print(node.data + " ");
            }
            else if (node.left != null) {
                printBoundaryRight(node.left);
                System.out.print(node.data + " ");
            }
            // do nothing if it is a leaf node, this way we avoid
            // duplicates in output
        }

        // A function to do boundary traversal of a given binary tree
        void printBoundary(Node node)
        {
            if (node == null)
                return;

            System.out.print(node.data + " ");

            // Print the left boundary in top-down manner.
            printBoundaryLeft(node.left);

            // Print all leaf nodes
            printLeaves(node.left);
            printLeaves(node.right);

            // Print the right boundary in bottom-up manner
            printBoundaryRight(node.right);
        }
    }
}
