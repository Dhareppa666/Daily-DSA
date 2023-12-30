package main.finale.nextLeap.graphs.class01.check_02;

import java.util.*;

// https://leetcode.com/problems/find-if-path-exists-in-graph/
// Graph formation is O(V + E) and BFS is additional O(V + E).
public class _1971_Find_if_Path_Exists_in_Graph {

    List<LinkedList<Integer>> adjList;

    private boolean seen;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (n <= 1) {
            return true;
        }
        this.adjList = new ArrayList();
        for (int i = 0; i < n; i++) {
            adjList.add(new LinkedList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            addEdge(src, dest);
            addEdge(dest, src);
        }
        if (adjList.get(source).contains(destination)) {
            return true;
        }
        this.seen = false;
        boolean[] visited = new boolean[n];
        dfs(visited, source, destination);
        return this.seen;
    }

    public void dfs(boolean[] visited, int source, int destination) {
        if (!visited[source] && !this.seen) {
            if (source == destination) {
                this.seen = true;
                return;
            }
            visited[source] = true;
            for (Integer i : adjList.get(source)) {
                dfs(visited, i, destination);
            }
        }
    }

    public void addEdge(int source, int dest) {
        adjList.get(source).add(dest);
        adjList.get(dest).add(source);
    }

}
