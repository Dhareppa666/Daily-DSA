package main.finale.DSA.graphs.class01.check_01;

import java.util.ArrayList;
import java.util.List;

class InwardAdjacencyList {
    int vertices;
    List<List<Integer>> inwardEdges;

    public InwardAdjacencyList(int vertices) {
        this.vertices = vertices;
        inwardEdges = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            inwardEdges.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        inwardEdges.get(destination).add(source);
    }

    public void displayInwardEdges() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " <-- ");
            for (int edge : inwardEdges.get(i)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        InwardAdjacencyList graph = new InwardAdjacencyList(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 2);
        graph.addEdge(4, 3);

        graph.displayInwardEdges();
    }
}

