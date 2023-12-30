package main.finale.DSA.trees;

import static main.finale.DSA.trees.Utils.getTree;

public class _543_Diameter_of_Binary_Tree {
    private static int max = 0;

    public static void main(String[] args) {
        diameterOfBinaryTree(getTree());
        System.out.println(max);
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}
