package main.finale.In_Walmart.Raj_Vik.Trees;

public class Utils {

    public static main.finale.In_Walmart.Raj_Vik.Trees.TreeNode getTree(){
        main.finale.In_Walmart.Raj_Vik.Trees.TreeNode root = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(1);
        root.left = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(2);
        root.right = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(3);
        root.left.left = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(4);
        root.left.right = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(5);
        root.left.right.left = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(8);
        root.right.left = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(6);
        root.right.right = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(7);
        root.right.right.left = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(9);
        root.right.right.right = new main.finale.In_Walmart.Raj_Vik.Trees.TreeNode(10);

        return root;
    }
}
