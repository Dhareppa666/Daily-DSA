package org.In_Walmart.LC.mera.man;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(){}
    public TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }
}

public class Tree_Symmetric {

    public static void main(String[] args) {
        isTreeSymmentrics(null, null);

    }

    private static boolean isTreeSymmentrics(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()){

        }
        return false;
    }

    public void bas_aise_hi(){
        final Integer x = 99;
        for(int i =0; i<200; i++){
            System.out.println();
        }
    }
}
