package main.finale.In_Walmart.nextLeap.graphs.check_01;

import java.util.*;

class Graph_DFS {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph_DFS(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // For undirected graphs
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int vertex = stack.pop();

            if (!visited[vertex]) {
                System.out.print(vertex + " ");
                visited[vertex] = true;

                for (int neighbor : adjacencyList.get(vertex)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 7;
        Graph_DFS graph = new Graph_DFS(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Depth-First Traversal (starting from vertex 0):");
        graph.dfs(0);
    }
}

