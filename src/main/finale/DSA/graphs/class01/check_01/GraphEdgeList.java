package main.finale.DSA.graphs.class01.check_01;

import java.util.ArrayList;
import java.util.List;

public class GraphEdgeList {
    List<Edge> edges;

    public GraphEdgeList() {
        edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination) {
        Edge edge = new Edge(source, destination);
        edges.add(edge);
    }

    public void displayEdges() {
        for (Edge edge : edges) {
            System.out.println("Edge: " + edge.source + " -> " + edge.destination);
        }
    }

    public static void main(String[] args) {
        GraphEdgeList graph = new GraphEdgeList();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.displayEdges();
    }
}

class Edge {
    int source;
    int destination;

    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }
}
