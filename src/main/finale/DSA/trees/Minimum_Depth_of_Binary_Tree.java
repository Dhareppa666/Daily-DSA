package main.finale.DSA.trees;

import main.finale.DSA.trees.TreeNode;


import java.util.LinkedList;
import java.util.Queue;

//111. Minimum Depth of Binary Tree
//https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
public class Minimum_Depth_of_Binary_Tree {

    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 1;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                TreeNode node = q.poll();
                if(node.left ==null && node.right == null) {
                    return depth;
                }
                if(node.left!=null) {
                    q.offer(node.left);
                }
                if(node.right!=null) {
                    q.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }

    public int minDepth2(TreeNode root) {
        // Your code goes here
        if(root == null) {
            return 0;
        }
        if(root.left ==null) {
            return 1+ minDepth(root.right);
        }
        if(root.right == null) {
            return 1+ minDepth(root.left);
        }
        return 1+Math.min(minDepth(root.right), minDepth(root.left));
    }
}
