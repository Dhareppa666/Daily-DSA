package main.finale.nextLeap.trees;

import main.finale.aa.DSA.trees.TreeNode;

public class _110_Balanced_Binary_Tree {

    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        isBal(root);
        return result;
    }

    public int isBal(TreeNode root) {
        if (root == null || !result) {
            return 0;
        }
        int l = isBal(root.left);
        int r = isBal(root.right);
        if (Math.abs(l - r) > 1) {
            result = false;
        }
        return 1 + Math.max(l, r);
    }
}
