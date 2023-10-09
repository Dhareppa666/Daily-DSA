package main.finale.Tech.Dose.Trees;

public class BinarySearchTree {

    public Node root; //Root of a Binary Tree.

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            //Assign the data to new node. set left and right children's as null.
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(3);
        bst.insert(4);
        bst.insert(7);
        bst.insert(2);
        bst.insert(5);
        bst.insert(1);
        bst.insert(6);

        //Displays the binary tree
        bst.preorderTraversal(bst.root);
        System.out.println();

        //Displays the binary tree
        bst.inorderTraversal(bst.root);
        System.out.println();

        //Displays the binary tree
        bst.postorderTraversal(bst.root);
        System.out.println();

        Node minNode = bst.minNode(bst.root);
        System.out.println("The min node is: "+minNode.data);

        System.out.println();
        bst.deleteNode(bst.root, 31);
        bst.inorderTraversal(bst.root);
    }

    private Node deleteNode(Node node, int value) {
        if (node == null)
            return null;
        else {
            //value is less than node's data then, search the value in left subtree
            if (value< node.data)
                node.left = deleteNode(node.left, value);
            //value is greater than node's data then, search the value in right subtree
            else if (value>node.data)
                node.right = deleteNode(node.right, value);

            //If value is equal to node's data that is, we have found the node to be deleted
            else {
                //If node to be deleted has no child then, set the node to null
                if (node.left == null && node.right == null)
                    node = null;
                //If node to be deleted has only one right child
                else if(node.left == null)
                    node = node.right;
                //If node to be deleted has only one left child
                else if(node.right == null)
                    node = node.left;
                //If node to be deleted has two children node
                else {
                    //then find the minimum node from right subtree
                    Node temp = minNode(node.right);
                    //Exchange the data between node and temp
                    node.data = temp.data;
                    //Delete the node duplicate node from right subtree
                    node.right = deleteNode(node.right, temp.data);
                }
            }
            return node;
        }
    }

    private Node minNode(Node node) {
        if (node.left!=null)
            return minNode(node.left);
        else
            return node;
    }

    private void inorderTraversal(Node node) {
        if (root == null){
            System.out.println("The Tree is Empty.");
            return;
        } else {
            if(node.left!=null)
                inorderTraversal(node.left);
            System.out.print(node.data+"->");
            if(node.right!=null)
                inorderTraversal(node.right);
        }
    }

    private void preorderTraversal(Node node) {
        if (root == null){
            System.out.println("The Tree is Empty.");
            return;
        } else {
            System.out.print(node.data+"->");
            if(node.left!=null)
                inorderTraversal(node.left);
            if(node.right!=null)
                inorderTraversal(node.right);
        }
    }

    private void postorderTraversal(Node node) {
        if (root == null){
            System.out.println("The Tree is Empty.");
            return;
        } else {
            if(node.left!=null)
                inorderTraversal(node.left);
            if(node.right!=null)
                inorderTraversal(node.right);
            System.out.print(node.data+"->");
        }
    }


    private void insert(int data) {
        //Create a new Node.
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root, parent = null;
            while (true) {
                parent = current;//Keep tracks of all the nodes parent.

                //If data is less than current's data, node will be inserted to the left of tree
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
}
