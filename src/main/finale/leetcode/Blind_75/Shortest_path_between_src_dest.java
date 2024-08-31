package main.finale.leetcode.Blind_75;

import java.util.*;

class Matrix {

    public int shortestDistance(int[][] matrix, int[] source, int[] destination) {
        int rows = matrix.length, cols = matrix[0].length;
        if (rows == 0 || cols == 0) {
            return -1;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(source[0], source[1], 0));  // Start distance is 0
        matrix[source[0]][source[1]] = -1;  // Mark as visited
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;
            int dist = node.dist;

            if (x == destination[0] && y == destination[1]) {
                return dist;
            }

            for (int[] dir : directions) {
                int nexX = x + dir[0];
                int nexY = y + dir[1];
                if (nexX >= 0 && nexX < matrix.length && nexY >= 0 && nexY < matrix[0].length && matrix[nexX][nexY] != -1) {
                    queue.add(new Node(nexX, nexY, dist + 1));  // Increment distance by 1
                    matrix[nexX][nexY] = -1;  // Mark as visited
                }
            }
        }
        return -1;  // Destination not reachable
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 35, 4},
                {21, 1, 42, 20},
                {32, 1, 0, 1}
        };
        int[] start = {0, 0};
        int[] end = {2, 3};
        Matrix o1 = new Matrix();
        System.out.println(o1.shortestDistance(grid, start, end));
    }
}

class Node {
    int x, y, dist;
    Node(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

public class Shortest_path_between_src_dest {

    public static void main(String[] args) {

    }


}
