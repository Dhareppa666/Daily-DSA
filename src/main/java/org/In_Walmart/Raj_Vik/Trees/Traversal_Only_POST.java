package org.In_Walmart.Raj_Vik.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Traversal_Only_POST {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Traversal_Only_POST obj = new Traversal_Only_POST();

        System.out.println("The Post order is : "+obj.postorderTraversal(Utils.getTree()));
        System.out.println("The Post order is : "+obj.postorderTraversal2(Utils.getTree()));
    }

    //Recursive
     public List<Integer> postorderTraversal(TreeNode root) {
         if(root == null){
             return list;
         }
         postorderTraversal(root.left);
         postorderTraversal(root.right);
         list.add(root.val);
         return list;
     }

     //Iterative with stack
    public List<Integer> postorderTraversal2(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return list;

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            list.addFirst(cur.val);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        return list;
    }
}
