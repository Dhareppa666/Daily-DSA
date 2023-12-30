package main.finale.DSA.trees;

public class searchBST {

    public static boolean searchBST(TreeNode root, int val) {
        // Your code goes here
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
