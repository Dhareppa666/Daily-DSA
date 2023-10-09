package main.finale.In_Walmart.LC.Daily;

import java.util.LinkedList;
import java.util.Queue;

//994. Rotting Oranges
public class Rotten_Oranges {

    public static void main(String[] args) {
        Rotten_Oranges rotten_oranges = new Rotten_Oranges();
        int res = rotten_oranges.orangesRotting(new int[][]{{2,1,1},{1,1,1},{0,1,2}});
        System.out.println("The Res is: "+res);
    }

    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i , j});
                }
                else if(grid[i][j] == 1) {
                    count_fresh++;
                }
            }
        }
        if(count_fresh == 0) return 0;
        int count = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()) {
            ++count;
            int size = queue.size();
            for(int i = 0 ; i < size ; i++) {
                int[] point = queue.poll();
                for(int dir[] : dirs) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2) continue;
                    grid[x][y] = 2;
                    queue.offer(new int[]{x , y});
                    count_fresh--;
                }
            }
        }
        return count_fresh == 0 ? count-1 : -1;
    }

        public int orangesRotting2(int[][] grid) {
            if(grid == null || grid.length == 0){
                return 0;
            }
            int m = grid.length;
            int n = grid[0].length;
            int freshCount = 0;

            Queue<int[]> queue = new LinkedList<>();

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(grid[i][j] == 2){
                        queue.offer(new int[]{i, j});
                    } else if(grid[i][j] == 1){
                        freshCount++;
                    }
                }
            }
            if(freshCount == 0 ){
                return 0;
            }
            int count = 0;
            int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
            while(!queue.isEmpty()){
                ++count;
                for(int i=0; i<queue.size(); i++){
                    int[] curr = queue.poll();
                    for(int[] currIndex: dir){
                        int row = currIndex[0] + curr[0];
                        int col = currIndex[1] + curr[1];
                        if(row<0 || row >=m || col<0 || col>=n || grid[row][col] == 0 || grid[row][col] == 2){
                            continue;
                        }
                        grid[row][col] = 2;
                        queue.offer(new int[]{row, col});
                        freshCount--;
                    }
                }
            }
            if(freshCount !=0 ){
                return -1;
            }
            return count-1;
        }
}
