package main.finale.In_Walmart.nextLeap.graphs.handson;
import java.util.*;

public class Graph_BFS_DFS {
    static class Graph {
        private int vertices;
        private List<List<Integer>> adjacencyList;

        public Graph(int vertices) {
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

        public void bfs(int startNode) {
            boolean[] visited = new boolean[vertices];
            visited[startNode] = true;
            Queue<Integer> queue = new LinkedList();
            queue.offer(startNode);

            while (!queue.isEmpty()) {
                List<Integer> adjNodes = adjacencyList.get(queue.poll());
                for(Integer node: adjNodes) {
                    if(!visited[node]) {
                        System.out.print(node+ " -> ");
                        visited[node] = true;
                        queue.offer(node);
                    }
                }
            }
        }

        public void dfs(int startNode) {
            System.out.println();
            boolean[] visited = new boolean[vertices];
            Stack<Integer> stack = new Stack<>();
            stack.push(startNode);

            while (!stack.isEmpty()) {
                Integer node = stack.pop();

                if(!visited[node]) {
                    visited[node] = true;
                    System.out.print(node+ " -> ");

                    for(int neighbor: adjacencyList.get(node)) {
                        if (!visited[neighbor]) {
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }


    }

    public static class Graph_DFS {
        public static void main(String[] args) {
            int vertices = 7;
            Graph graph = new Graph(vertices);

            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(1, 4);
            graph.addEdge(2, 5);
            graph.addEdge(2, 6);

            System.out.println("Breadth-First Traversal (starting from vertex 0):");
            graph.bfs(0);

            graph.dfs(0);
        }
    }
}
