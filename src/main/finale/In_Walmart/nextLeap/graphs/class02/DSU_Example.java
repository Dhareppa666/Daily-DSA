package main.finale.In_Walmart.nextLeap.graphs.class02;

class DSU {
    private int[] parent;
    private int[] rank;

    public DSU(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) {
            return;
        }
        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }
}

public class DSU_Example {
    public static void main(String[] args) {
        int size = 5;
        DSU dsu = new DSU(size);

        dsu.union(0, 1);
        dsu.union(2, 3);
        dsu.union(3, 4);

        System.out.println("Are 1 and 3 in the same set? " + (dsu.find(1) == dsu.find(3)));
        System.out.println("Are 0 and 2 in the same set? " + (dsu.find(0) == dsu.find(2)));
    }
}
