package main.finale.nextLeap.trees;

import java.util.*;

public class Create_Binary_Tree_From_Descriptions {

    //Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
    //Output: [50,20,80,15,17,19]
    public static void main(String[] args) {
        TreeNode res = createBinaryTree(new int[][]{ {20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1} });
        System.out.println(res);
        inorderTraversal(res);
    }

    public static TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();
        for (int[] arr : descriptions) {
            int parent = arr[0], child = arr[1], isLeft = arr[2];
            children.add(child);
            TreeNode node = map.getOrDefault(parent, new TreeNode(parent));
            if (isLeft == 1) {
                node.left = map.getOrDefault(child, new TreeNode(child));
                map.put(child, node.left);
            } else {
                node.right = map.getOrDefault(child, new TreeNode(child));
                map.put(child, node.right);
            }
            map.put(parent, node);
        }

        int root = -1;
        for (int[] arr : descriptions) {
            if (!children.contains(arr[0])) {
                root = arr[0];
                break;
            }
        }

        return map.getOrDefault(root, null);
    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        inorderTraversal(root.right);
        System.out.print(root.data + " ");

    }
}
