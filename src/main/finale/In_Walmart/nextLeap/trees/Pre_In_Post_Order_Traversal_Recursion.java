package main.finale.In_Walmart.nextLeap.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Pre_In_Post_Order_Traversal_Recursion {

    public static void main(String[] args) {
        // Usage
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);

        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        inorderTraversal_Iterative(root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        preorderTraversal(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postorderTraversal(root);
        System.out.println();
    }

    // Inorder Traversal
    public static void inorderTraversal(TreeNode root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    public static void inorderTraversal_Iterative(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.left!=null) {
                queue.offer(root.left);
            }
            if(node.right!=null) {
                queue.offer(root.right);
                continue;
            }
        }
    }

    // Preorder Traversal
    static void preorderTraversal(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // Postorder Traversal
    static void postorderTraversal(TreeNode root) {
        if (root == null)
            return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}

