package main.finale.nextLeap.graphs.class03.mst;

import java.util.*;

public class Prims_Algorithm {

    public static void main(String[] args) {
        int V = 4, E = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(0, 1, 2));
        graph.get(0).add(new Edge(0, 2, 3));
        graph.get(1).add(new Edge(1, 0, 2));
        graph.get(1).add(new Edge(1, 2, 4));
        graph.get(1).add(new Edge(1, 3, 2));
        graph.get(2).add(new Edge(2, 0, 3));
        graph.get(2).add(new Edge(2, 1, 4));
        graph.get(2).add(new Edge(2, 3, 5));
        graph.get(3).add(new Edge(3, 1, 2));
        graph.get(3).add(new Edge(3, 2, 5));

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] inMST = new boolean[V];

        int startingVertex = 0;
        inMST[startingVertex] = true;
        for (Edge edge : graph.get(startingVertex)) {
            pq.add(edge);
        }

        ArrayList<Edge> mst = new ArrayList<>();
        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            int dest = edge.dest;

            if (!inMST[dest]) {
                mst.add(edge);
                inMST[dest] = true;

                for (Edge newEdge : graph.get(dest)) {
                    if (!inMST[newEdge.dest]) {
                        pq.add(newEdge);
                    }
                }
            }
        }

        System.out.println("Minimum Spanning Tree Edges:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }
}
