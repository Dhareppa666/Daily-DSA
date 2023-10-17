package main.finale.In_Walmart.LC.Daily;

public class _1361_Validate_Binary_Tree_Nodes {

    int components;
    int[] parent = null;

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        components = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1 && !union(i, leftChild[i])) {
                return false;
            }
            if (rightChild[i] != -1 && !union(i, rightChild[i])) {
                return false;
            }
        }
        return components == 1;
    }

    private boolean union(int par, int child) {
        int childParent = find(child);
        if (childParent != child) {
            return false;
        }

        int parentParent = find(par);
        if (parentParent == childParent) {
            return false;
        }

        parent[child] = par;
        components--;
        return true;
    }

    public int find(int i) {
        if (parent[i] == i) {
            return i;
        }
        return parent[i] = find(parent[i]);
    }
}
