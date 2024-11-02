package main.finale.DSA.graphs.class03.shortest_path.handson;

import main.finale.DSA.graphs.class03.shortest_path.Dijkstras_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class dijikstra_Algo {

    static class Node implements Comparable {
        int vertex;
        int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        public int compareTo(Object other) {
            Node newObj = (Node) other;
            return Integer.compare(this.distance, newObj.distance);
        }
    }

    public static void main(String[] args) {
        int vertex = 4;
        int source = 0;

        List<ArrayList<Node>> adjList = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(new Node(1, 2));
        adjList.get(0).add(new Node(2, 3));
        adjList.get(1).add(new Node(0, 2));
        adjList.get(1).add(new Node(3, 1));
        adjList.get(2).add(new Node(0, 3));
        adjList.get(2).add(new Node(3, 4));
        adjList.get(3).add(new Node(1, 1));
        adjList.get(3).add(new Node(2, 4));

        int[] distance = new int[vertex];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        minHeap.add(new Node(source, 0));

        while (!minHeap.isEmpty()) {
            Node polled = minHeap.poll();
            int u = polled.vertex;

            for (Node nei : adjList.get(u)) {
                int v = nei.vertex;
                int weight = nei.distance;

                if (weight + distance[u] < distance[v]) {
                    distance[v] = weight + distance[u];
                    minHeap.add(new Node(v, distance[v]));
                }
            }
        }

        System.out.println("Shortest Distances from Source:");
        for (int i = 0; i < vertex; i++) {
            System.out.println("Source from " + source + " to " + i + "-> " + distance[i]);
        }
    }

}
