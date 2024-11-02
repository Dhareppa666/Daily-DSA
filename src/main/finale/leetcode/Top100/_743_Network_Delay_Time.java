package main.finale.leetcode.Top100;

import java.util.*;

public class _743_Network_Delay_Time {

    public static void main(String[] args) {
//        Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
//        Output: 2
    }

    static class Node implements Comparable<Node> {
        int vertex, distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        List<ArrayList<Node>> adjList = new ArrayList<>();
        for (int i = 1; i <= n + 1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] a : times) {
            adjList.get(a[0]).add(new Node(a[1], a[2]));
        }

        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;

        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        minHeap.offer(new Node(k, 0));

        int count = 0;
        while (!minHeap.isEmpty()) {
            Node polled = minHeap.poll();
            int u = polled.vertex;

            for (Node nei : adjList.get(u)) {
                int dist = nei.distance;
                int v = nei.vertex;

                if (distance[u] + dist < distance[v]) {
                    distance[v] = distance[u] + dist;
                    minHeap.offer(new Node(v, distance[v]));
                }
            }
        }

        int ans = 0;
        for (int i = 1; i < distance.length; i++) {
            ans = Math.max(ans, distance[i]);
            if (ans == Integer.MAX_VALUE) return -1;
        }
        return ans;
    }
}
