package main.finale.leetcode.Top100;

import java.util.*;

//https://leetcode.com/problems/cheapest-flights-within-k-stops
public class _787_Cheapest_Flights_Within_K_Stops {

    //bellmon
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[] cost = new int[n];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[src] = 0;
        for (int i = 0; i <= K; i++) {
            int[] temp = Arrays.copyOf(cost, n);
            for (int[] f : flights) {
                int curr = f[0], next = f[1], price = f[2];
                if (cost[curr] == Integer.MAX_VALUE) continue;
                temp[next] = Math.min(temp[next], cost[curr] + price);
            }
            cost = temp;
        }
        return cost[dst] == Integer.MAX_VALUE ? -1 : cost[dst];
    }

    //dijikstra's
    public int findCheapestPrice2(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] f : flights) {
            map.putIfAbsent(f[0], new ArrayList<>());
            map.get(f[0]).add(new int[]{f[1], f[2]});
        }
        PriorityQueue<int[]> q = new PriorityQueue<>(
                new Comparator<int[]>() {

                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return Integer.compare(o1[0], o2[0]);
                    }
                }
        );
        q.offer(new int[]{0, src, K + 1});
        while (!q.isEmpty()) {
            int[] c = q.poll();
            int cost = c[0];
            int curr = c[1];
            int stop = c[2];
            if (curr == dst) return cost;
            if (stop > 0) {
                if (!map.containsKey(curr)) continue;
                for (int[] next : map.get(curr)) {
                    q.add(new int[]{cost + next[1], next[0], stop - 1});
                }
            }
        }
        return -1;
    }

    //BFS
    public int findCheapestPrice3(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] i : flights) {
            map.putIfAbsent(i[0], new ArrayList<>());
            map.get(i[0]).add(new int[]{i[1], i[2]});
        }
        int step = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{src, 0});
        int ans = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                if (curr[0] == dst)
                    ans = Math.min(ans, curr[1]);
                if (!map.containsKey(curr[0]))
                    continue;
                for (int[] f : map.get(curr[0])) {
                    if (curr[1] + f[1] > ans)      //Pruning
                        continue;
                    q.offer(new int[]{f[0], curr[1] + f[1]});
                }
            }
            if (step++ > K)
                break;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
