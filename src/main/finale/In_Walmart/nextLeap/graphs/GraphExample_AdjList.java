package main.finale.In_Walmart.nextLeap.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphExample_AdjList {
    public static void main(String[] args) {
        int vertices = 5;
        GraphAdjacencyList graph = new GraphAdjacencyList(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.displayGraph();
    }
}


class GraphAdjacencyList {
    private int vertices;
    private List<LinkedList<Integer>> adjacencyList;

    public GraphAdjacencyList(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // For undirected graphs
    }

    public void displayGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " --> ");
            for (Integer neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

