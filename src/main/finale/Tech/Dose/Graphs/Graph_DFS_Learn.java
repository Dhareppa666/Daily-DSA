package main.finale.Tech.Dose.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_DFS_Learn {
    private int V;
    private LinkedList<Integer>[] adj;

    public Graph_DFS_Learn(int v) {
        this.V = v;
        adj = new LinkedList[v];
        for (int index = 0; index < v; index++)
            adj[index] = new LinkedList<>();
    }

    public void addEdge(int v, int e) {
        adj[v].add(e);
    }

    public static void main(String[] args) {
        Graph_DFS_Learn g = new Graph_DFS_Learn(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal  (starting from vertex 2)");

        g.DFS(2);
    }

    private void DFS(int v) {
        boolean[] visited = new boolean[V];

        DFS_parse(v, visited);
    }

    private void DFS_parse(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> itr = adj[v].listIterator();
        while (itr.hasNext()) {
            int Node = itr.next();
            if (!visited[Node])
                DFS_parse(Node, visited);
        }
    }
}