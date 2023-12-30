package main.finale.DSA.graphs.class02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course_Schedule {

    List<LinkedList<Integer>> adj;

    //01: BFS Approach
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Your code goes here
        adj = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            adj.add(new LinkedList<Integer>());
        }
        int[] indegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int source = prerequisites[i][0];
            int dest = prerequisites[i][1];
            if (source == dest) {
                return false;
            }
            addEdge(prerequisites[i][0], prerequisites[i][1]);
        }
        for (int i = 0; i < numCourses; i++) {
            for (Integer neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int peek = queue.poll();
            for (Integer x : adj.get(peek)) {
                indegree[x]--;
                if (indegree[x] == 0) {
                    queue.offer(x);
                }
            }
        }
        return count == numCourses;
    }

    public void addEdge(int src, int dest) {
        adj.get(src).add(dest);
    }

    //02: DFS Approach

}
