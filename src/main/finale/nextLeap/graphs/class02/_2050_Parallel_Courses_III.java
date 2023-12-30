package main.finale.nextLeap.graphs.class02;

import java.util.*;

public class _2050_Parallel_Courses_III {

    private static List<LinkedList<Integer>> adj;

    public static int minimumTime(int n, int[][] relations, int[] time) {
        adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new LinkedList<Integer>());
        }
        int[] indegree = new int[n];
        for (int i = 0; i < relations.length; i++) {
            int source = relations[i][0];
            int dest = relations[i][1];
            adj.get(source - 1).add(dest - 1);
        }
        for (int i = 0; i < n; i++) {
            for (Integer neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }
        int[] maxTime = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                maxTime[i] = time[i];
            }
        }
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : adj.get(node)) {
                maxTime[neighbor] = Math.max(maxTime[neighbor], maxTime[node] + time[neighbor]);
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++)
            result = Math.max(result, maxTime[i]);
        return result;
    }

    public static void main(String[] args) {
//        int res = minimumTime(5, new int[][]{{1,5},{2,5},{3,5},{3,4},{4,5}}, new int[]{1,2,3,4,5});
        int res = minimumTime(3, new int[][]{{1, 3}, {2, 3}}, new int[]{3, 2, 5}); //n = 3, relations = [[1,3],[2,3]], time = [3,2,5]
        System.out.println(res);
    }
}
