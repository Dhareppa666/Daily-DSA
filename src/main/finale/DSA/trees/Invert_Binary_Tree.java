package main.finale.DSA.trees;


public class Invert_Binary_Tree {

    public TreeNode invertTree(TreeNode root) {
        // Your code goes here
        if(root==null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
