package main.finale.In_Walmart.Raj_Vik.Trees.Concepts;

import main.finale.In_Walmart.Raj_Vik.Trees.Utils;
import main.finale.In_Walmart.Raj_Vik.Trees.TreeNode;

import java.util.*;

public class Traversal_Only_IN {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Traversal_Only_IN obj = new Traversal_Only_IN();

        System.out.println("The In order is : "+obj.inorderTraversal(Utils.getTree()));
        System.out.println("The In order is : "+obj.inorderTraversal2(Utils.getTree()));

    }

    //Recursive
     public List<Integer> inorderTraversal(TreeNode root) {
         if(root == null){
             return list;
         }
         inorderTraversal(root.left);
         list.add(root.val);
         inorderTraversal(root.right);
         return list;
     }

     //Iterative with stack
     public List<Integer> inorderTraversal2(TreeNode root) {
         List<Integer> list = new LinkedList<>();
         if(root == null){
             return list;
         }
         Stack<TreeNode> stack = new Stack<>();
         TreeNode curr = root;
         while(curr!=null || !stack.empty()){
             while(curr!=null){
                 stack.push(curr);
                 curr = curr.left;
             }
             curr = stack.pop();
             list.add(curr.val);
             curr = curr.right;
         }
         return list;
     }
}
