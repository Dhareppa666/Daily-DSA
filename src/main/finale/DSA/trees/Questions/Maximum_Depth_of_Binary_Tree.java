package main.finale.DSA.trees.Questions;

import main.finale.aa.DSA.trees.Utils;
import main.finale.aa.DSA.trees.TreeNode;
import java.util.*;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
//104 Maximum_Depth_of_Binary_Tree
public class Maximum_Depth_of_Binary_Tree {

    public static void main(String[] args) {
        System.out.println("The max depth of tree is: "+ maxDepth(Utils.getTree()));
        System.out.println("The max depth of tree is: "+ maxDepth2(Utils.getTree()));
    }

    private static int maxDepth2(TreeNode root) {
        if(root==null){return 0;}
        int lt = maxDepth2(root.left);
        int rt = maxDepth2(root.right);

        return 1+ Math.max(lt,rt);
    }

    public static int maxDepth(TreeNode root) {
        int res = 0;
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int queueNum = queue.size();
            for(int i=0; i<queueNum; i++){
                TreeNode curr = queue.poll();
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            res++;
        }
        return res;
    }
}
