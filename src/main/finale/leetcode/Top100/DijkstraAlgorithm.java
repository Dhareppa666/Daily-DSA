package main.finale.leetcode.Top100;

import java.util.*;

public class DijkstraAlgorithm {

    static class Edge {
        int target;
        int weight;

        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static int[] dijkstra(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        minHeap.offer(new Node(source, 0));

        while (!minHeap.isEmpty()) {
            Node current = minHeap.poll();
            int u = current.vertex;

            for (Edge edge : graph.get(u)) {
                int v = edge.target;
                int weight = edge.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    minHeap.offer(new Node(v, dist[v]));
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Adding edges: graph.get(from).add(new Edge(to, weight));
        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(4, 3));
        graph.get(1).add(new Edge(2, 2));
        graph.get(1).add(new Edge(4, 4));
        graph.get(2).add(new Edge(3, 9));
        graph.get(3).add(new Edge(2, 7));
        graph.get(4).add(new Edge(1, 1));
        graph.get(4).add(new Edge(2, 8));
        graph.get(4).add(new Edge(3, 2));

        int[] distances = dijkstra(graph, 0);

        System.out.println("Shortest distances from node 0:");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("To node " + i + " = " + distances[i]);
        }
    }
}
