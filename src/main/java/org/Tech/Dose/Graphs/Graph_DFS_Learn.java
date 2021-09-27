package org.Tech.Dose.Graphs;

// Java program to print DFS traversal from a given graph

import java.util.Iterator;
import java.util.LinkedList;

// This class represents a directed graph using adjacency list representation
public class Graph_DFS_Learn {
    private int V;

    private LinkedList<Integer> adj[];

    public Graph_DFS_Learn(int v){
        this.V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; i++)
            adj[i] = new LinkedList<>();
    }

    public static void main(String[] args) {
        Graph_DFS_Learn graph = new Graph_DFS_Learn(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Finding the DFS from 2");

        graph.findDfs(2);
    }

    private void addEdge(int v, int w) {
        adj[v].add(w);
    }

    private void findDfs(int v) {
        boolean[] visited = new boolean[V];
        DsfUtils(v, visited);
    }

    private void DsfUtils(int v, boolean[] visited) {
        System.out.print(v);
        visited[v] = true;

        Iterator<Integer> itr = adj[v].listIterator();
        while (itr.hasNext()){
            int node = itr.next();
            if(!visited[node])
                DsfUtils(node, visited);
        }
    }
}