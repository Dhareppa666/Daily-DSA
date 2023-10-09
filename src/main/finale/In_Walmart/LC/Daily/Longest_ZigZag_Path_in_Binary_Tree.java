package main.finale.In_Walmart.LC.Daily;

import main.finale.In_Walmart.Raj_Vik.Trees.TreeNode;

// 1372. Longest ZigZag Path in a Binary Tree
public class Longest_ZigZag_Path_in_Binary_Tree {

    public static void main(String[] args) {

    }

    int res = 0;

    public void dfs(TreeNode root, boolean isLeft, int currentLength){
        if(root == null){
            return;
        }
        res = Math.max(res, currentLength);
        if(isLeft){
            dfs(root.left, false, currentLength+1);
            dfs(root.right, true, 1);
        } else {
            dfs(root.left, false, 1);
            dfs(root.right, true, currentLength+1);
        }
    }

    public int longestZigZag(TreeNode root) {
        dfs(root, true, 0);
        dfs(root, false, 0);
        return res;
    }
}
