package org.patterns.Problems;

public class Knight_Moves {

    static class Point{
        int x;
        int y;
        int dis;
        public Point(int x, int y, int dis){
            this.x= x;
            this.y = y;
            this.dis = dis;
        }
    }

    static boolean isValid(int x, int y, int n){
        if(x>=0 && y>=0 && x<n && y<n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int minimumMoves = minMoves(0,0, 2,0, 5);
    }

    private static int minMoves(int startRow, int startCol, int endRow, int endCol, int n) {
        int[] dx = {-2,-1, 1,2, -2, -1, 1, 2};
        int[] dy = {-1,-2, 2,1, 1, 2, -2, -1};

        boolean[][] visited = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                visited[i][j] = false;
            }
        }
        visited[startRow][startCol] = true;
        return -1;
    }
}
