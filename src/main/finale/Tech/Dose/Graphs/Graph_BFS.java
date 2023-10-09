package main.finale.Tech.Dose.Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//Time complexity -> O(V+E) //where V is the number of nodes in the graph, and E is the number of edges.
//Space COmplexity -> O(V) //Since the algorithm requires a queue for storing the nodes that need to be traversed at any point in time
public class Graph_BFS {
    private int V;

    private LinkedList<Integer> adj[];

    private Queue<Integer> queue;

    public Graph_BFS(int v) {
        this.V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
        queue = new LinkedList<Integer>();
    }


    public static void main(String[] args) {
        Graph_BFS graph = new Graph_BFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        graph.BFS(0);

    }

    private void BFS(int v) {
        boolean[] visited = new boolean[V];
        visited[v] = true;

        queue.add(v);
        while (queue.size() != 0) {
            v = queue.poll();
            System.out.print(v + " ");

            Iterator<Integer> itr = adj[v].listIterator();
            while (itr.hasNext()) {
                int node = itr.next();
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                }
            }
        }

    }

    private void addEdge(int v, int w) {
        adj[v].add(w);
    }
}


