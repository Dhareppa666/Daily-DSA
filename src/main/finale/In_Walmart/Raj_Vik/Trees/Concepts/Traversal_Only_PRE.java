package org.In_Walmart.Raj_Vik.Trees.Concepts;

import org.In_Walmart.Raj_Vik.Trees.TreeNode;
import org.In_Walmart.Raj_Vik.Trees.Utils;

import java.util.*;

public class Traversal_Only_PRE {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Traversal_Only_PRE obj = new Traversal_Only_PRE();

        System.out.println("The Pre order is : "+obj.preorderTraversal(Utils.getTree()));

        System.out.println("The Pre order is : "+obj.preorderTraversal2(Utils.getTree()));

    }

    //Recursive
     public List<Integer> preorderTraversal(TreeNode root) {
         if(root == null){
             return list;
         }
         list.add(root.val);
         preorderTraversal(root.left);
         preorderTraversal(root.right);
         return list;
     }

     //Iterative with stack
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> toVisit = new Stack<>();
        toVisit.push(root);

        while(toVisit.size()!=0){
            TreeNode current = toVisit.pop();
            if(current!=null){
                list.add(current.val);
                toVisit.add(current.right);
                toVisit.add(current.left);
            }
        }
        return list;
    }
}
