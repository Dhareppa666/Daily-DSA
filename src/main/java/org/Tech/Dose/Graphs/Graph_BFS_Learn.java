package org.Tech.Dose.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph_BFS_Learn {
    private int V;
    private LinkedList<Integer>[] adj;
    private Queue<Integer> queue;

    public Graph_BFS_Learn(int v){
        this.V=v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<>();
    }

    public void addEdge(int v, int edge){
        adj[v].add(edge);
    }

    public static void main(String[] args) {
        Graph_BFS_Learn graph = new Graph_BFS_Learn(6);

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
        while(queue.isEmpty()){
            int node = queue.poll();
            System.out.print(v+" ");

            if (!visited[node]){
                queue.add(node);
                visited[node] = true;
            }
        }
    }
}
