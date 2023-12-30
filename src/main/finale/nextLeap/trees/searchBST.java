package main.finale.nextLeap.trees;

public class searchBST {

    public static boolean searchBST(TreeNode root, int val) {
        // Your code goes here
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }
        if (root.data < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
