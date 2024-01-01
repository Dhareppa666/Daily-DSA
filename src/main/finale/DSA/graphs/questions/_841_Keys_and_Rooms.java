package main.finale.DSA.graphs.questions;

import java.util.ArrayList;
import java.util.List;

public class _841_Keys_and_Rooms {

    public static void main(String[] args) {
        List<List<Integer>> rooms= new ArrayList<>();
        for(int i=0; i<=4; i++) {
            rooms.add(new ArrayList<>());
        }
        rooms.get(0).add(1);
        rooms.get(1).add(2);
        rooms.get(2).add(3);
        boolean res = canVisitAllRooms(rooms);
        System.out.println(res);
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        dfsSearch(rooms, visited, 0);

        for (boolean b : visited) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    private static void dfsSearch(List<List<Integer>> rooms, boolean[] visited, int node) {
        if(visited[node]) {
            return;
        }
        visited[node] = true;
        for (int nextNode : rooms.get(node)) {
            dfsSearch(rooms, visited, nextNode);
        }
    }
}
