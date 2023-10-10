package main.finale.In_Walmart.nextLeap.graphs.check_01;

public class GraphExample_AdjMatrix {
    public static void main(String[] args) {
        int vertices = 5;
        AdjacencyMatrix graph = new AdjacencyMatrix(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.displayMatrix();
    }
}

class AdjacencyMatrix {
    int[][] matrix;
    int vertices;

    public AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1; // For undirected graphs
    }

    public void displayMatrix() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
