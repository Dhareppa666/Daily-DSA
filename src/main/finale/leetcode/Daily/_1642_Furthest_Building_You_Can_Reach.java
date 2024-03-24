package main.finale.leetcode.Daily;

import java.util.PriorityQueue;

public class _1642_Furthest_Building_You_Can_Reach {

    public static void main(String[] args) {

    }

    // TC : O(nlogn)
    // SC : O(ladders)
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        // Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < heights.length - 1; i++) {
            int gap = heights[i + 1] - heights[i];
            if (gap > 0) {
                pq.add(gap);
            }

            // The ladders are not enough you will have use bricks
            // which gap will u fill, where the value is least
            if (pq.size() > ladders) {
                bricks -= pq.poll();
            }

            if (bricks < 0) {
                return i;
            }
        }
        return heights.length - 1;
    }
}
