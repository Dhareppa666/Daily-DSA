package main.finale.In_Walmart.nextLeap.trees;

//https://leetcode.com/problems/binary-tree-pruning/
public class Binary_Tree_Pruning {


    // 01: Post-Order Traversal
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.data == 0) {
            return null;
        }
        return root;
    }

    // 02:
    public TreeNode pruneTree2(TreeNode root) {
        return containsOne(root) ? root : null;
    }

    public boolean containsOne(TreeNode node) {
        if (node == null) return false;

        // Check if any node in the left subtree contains a 1.
        boolean leftContainsOne = containsOne(node.left);

        // Check if any node in the right subtree contains a 1.
        boolean rightContainsOne = containsOne(node.right);

        // If the left subtree does not contain a 1, prune the subtree.
        if (!leftContainsOne) node.left = null;

        // If the right subtree does not contain a 1, prune the subtree.
        if (!rightContainsOne) node.right = null;

        // Return true if the current node, its left or right subtree contains a 1.
        return node.data == 1 || leftContainsOne || rightContainsOne;
    }
}
