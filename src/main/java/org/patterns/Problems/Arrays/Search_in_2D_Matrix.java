package org.patterns.Problems.Arrays;

//Search a 2D Matrix
//https://leetcode.com/problems/search-a-2d-matrix/
public class Search_in_2D_Matrix {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        searchMatrix(arr, 3);
    }

    //Check how  DEVIDE and MOD are happening here.
    public static boolean searchMatrix(int[][] matrix, int target) {
        int left=0, right=(matrix.length*matrix[0].length)-1;//0,12
        int m = matrix[0].length;
        while(left<=right){
            int middle = left+(right-left)/2;//12-->6
            if(matrix[middle/m][middle%m] == target){
                return true;
            } else if(matrix[middle/m][middle%m]<target){
                left = middle+1;
            } else {
                right = middle-1;
            }
        }
        return false;
    }
}
