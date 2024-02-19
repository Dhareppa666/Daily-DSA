package main.finale.leetcode.Blind_75.trees;

import main.finale.DSA.trees.TreeNode;

//https://leetcode.com/problems/validate-binary-search-tree/
public class isValidBST {

    public boolean isValidBST(TreeNode root) {
        return isBst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isBst(TreeNode root, Long min, Long max) {
        if(root == null) {
            return true;
        } else if(root.val <= min || root.val >= max) {
            return false;
        } else {
            return isBst(root.left, min, (long) root.val) && isBst(root.right, (long) root.val, max);
        }
    }
}
