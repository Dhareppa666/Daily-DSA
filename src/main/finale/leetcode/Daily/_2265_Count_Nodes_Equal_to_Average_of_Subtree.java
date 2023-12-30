package main.finale.leetcode.Daily;

import main.finale.aa.DSA.trees.TreeNode;

public class _2265_Count_Nodes_Equal_to_Average_of_Subtree {

    int res = 0;
    public int averageOfSubtree(TreeNode root) {
        rec(root, 0);
        return res;
    }

    public int rec(TreeNode root, int currSum) {
        if(root == null) {
            return currSum;
        }
        int left = rec(root.left, currSum + root.val );
        int right = rec(root.right, currSum + root.val);
        if((left+right)/2 == root.val) {
            res++;
        }
        return left + right - root.val;
    }
}
