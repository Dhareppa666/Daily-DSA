package main.finale.DSA.trees;

public class Validate_Binary_Search_Tree {

    public boolean isValidBST(TreeNode root) {
        // Your code goes here
        return isBST(root, Long.MIN_VALUE, Long.MIN_VALUE);
    }

    public boolean isBST(TreeNode root, Long min, Long max) {
        if(root == null) {
            return true;
        } else if (root.val <= min || root.val >= max) {
            return false;
        } else {
            return isBST(root.left, min, (long) root.val) && isBST(root.right, (long) root.val, max);
        }
    }

}
