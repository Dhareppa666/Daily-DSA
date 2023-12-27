package main.finale.In_Walmart.nextLeap.graphs.class03.shortest_path;

import java.util.*;

public class Dijkstras_Algorithm {

    static class Node implements Comparable<Node> {
        int vertex, distance;

        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Node>> graph = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Node(1, 2));
        graph.get(0).add(new Node(2, 3));
        graph.get(1).add(new Node(0, 2));
        graph.get(1).add(new Node(3, 1));
        graph.get(2).add(new Node(0, 3));
        graph.get(2).add(new Node(3, 4));
        graph.get(3).add(new Node(1, 1));
        graph.get(3).add(new Node(2, 4));

        int source = 0;
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;

            for (Node neighbor : graph.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.distance;

                if (distance[u] + weight < distance[v]) {
                    distance[v] = distance[u] + weight;
                    pq.add(new Node(v, distance[v]));
                }
            }
        }

        System.out.println("Shortest Distances from Source:");
        for (int i = 0; i < V; i++) {
            System.out.println("Source from "+source+" to " + i + "-> " + distance[i]);
        }
    }
}
