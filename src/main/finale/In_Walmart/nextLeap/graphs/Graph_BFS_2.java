package main.finale.In_Walmart.nextLeap.graphs;

import java.util.*;

public class Graph_BFS_2 {

    public List<LinkedList<Integer>> adjList;

    public int vertices;

    public Graph_BFS_2(int vertices) {
        this.vertices = vertices;
        this.adjList = new ArrayList<>(vertices);
        for(int i=0; i<vertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public void addNode(int source, int dest) {
        adjList.get(source).addLast(dest);
    }

    public void dfs(int sourceNode) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceNode);
        visited[sourceNode] = true;

        while (!queue.isEmpty()) {
            Integer curr = queue.poll();
            System.out.print(curr+ " ");

            for(Integer x : adjList.get(curr)) {
                if(!visited[x]) {
                    queue.offer(x);
                    visited[x] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        Graph_BFS_2 graph = new Graph_BFS_2(7);

        graph.addNode(0, 1);
        graph.addNode(0, 2);
        graph.addNode(1, 3);
        graph.addNode(1, 4);
        graph.addNode(2, 5);
        graph.addNode(2, 6);

        graph.dfs(0);
    }
}
