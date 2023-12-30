package main.finale.DSA.trees;

import main.finale.DSA.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _test {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        _test obj = new _test();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        System.out.println("The In order is : "+obj.preorderTraversal(root));

        System.out.println("The Pre order is : "+obj.preorderTraversal2(root));

    }

    //Recursive
     public List<Integer> preorderTraversal(TreeNode root) {
         if(root == null){
             return list;
         }
         preorderTraversal(root.left);
         list.add(root.val);
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
            TreeNode current = toVisit.peek();
            if(current!=null){
                toVisit.add(current);
                toVisit.add(current.right);
                toVisit.add(current.left);
            }
        }
        return list;
    }
}
