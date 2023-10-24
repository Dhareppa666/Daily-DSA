package main.finale.In_Walmart.nextLeap.graphs.class03.mst;

import java.util.*;

public class Kruskals_algo {

    static int[] parent;

    static int findParent(int vertex) {
        if (parent[vertex] == -1)
            return vertex;
        return findParent(parent[vertex]);
    }

    static void union(int xVertex, int yVertex) {
        int xParent = findParent(xVertex);
        int yParent = findParent(yVertex);
        parent[xParent] = yParent;
    }

    public static void main(String[] args) {
        int V = 4, E = 5;
        Edge[] edges = new Edge[E];
        edges[0] = new Edge(0, 1, 2);
        edges[1] = new Edge(0, 2, 3);
        edges[2] = new Edge(1, 2, 4);
        edges[3] = new Edge(1, 3, 2);
        edges[4] = new Edge(2, 3, 5);

        Arrays.sort(edges);

        parent = new int[V];
        Arrays.fill(parent, -1);

        ArrayList<Edge> mst = new ArrayList<>();
        int sum = 0;
        for (Edge edge : edges) {
            int srcParent = findParent(edge.src);
            int destParent = findParent(edge.dest);

            if (srcParent != destParent) {
                sum += edge.weight;
                mst.add(edge);
                union(srcParent, destParent);
            }
        }

        System.out.println("Minimum Cost Spanning Tree Edges:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " -> " + edge.dest + " : " + edge.weight);
        }
        System.out.println("The total weight is: " + sum);
    }
}
