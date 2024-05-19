package main.intvs.int2023_24;

import java.util.Arrays;

public class General_asked_Ques2 {

    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
//        int[][] arr = {{1,2,3, 4},{12,13,14,5},{11,16,15, 6}, {10,9,8,7}};
//        int[][] arr = {{1,2,3, 4,5,6}};
        int[][] arr = {{1},{2},{3},{4},{5},{6}};

        int[] res = new int[arr.length * arr[0].length];

        int index = 0;
        int top = 0, right = arr[0].length-1, left = 0, bottom = arr.length-1;
        while(top <= right) {
            for(int j=top; j<=right; j++) {
                res[index++] = arr[top][j];
            }
            if(top == bottom) {
                break;
            }
            for(int j=top+1; j<bottom; j++) {
                res[index++] = arr[j][right];
            }
            for(int j=right; j>=left; j--) {
                res[index++] = arr[bottom][j];
            }
            if(left == right) {
                break;
            }
            for(int j=bottom-1; j>top; j--) {
                res[index++] = arr[j][left];
            }

            right--;
            bottom--;
            left++;
            top++;
        }
        System.out.println(Arrays.toString(res));
    }
}
