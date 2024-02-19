package main.finale.leetcode.Blind_75.trees;

import main.finale.DSA.trees.TreeNode;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class _Kth_Smallest_Element_in_a_BST {

    private static int number = 0;
    private static int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }

    public void helper(TreeNode root) {
        if (root.left != null) {
            helper(root.left);
        }
        count--;
        if (count == 0) {
            number = root.val;
            return;
        }

        if (root.right != null) {
            helper(root.right);
        }
    }
}
