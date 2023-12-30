package main.finale.leetcode.Daily;

import java.util.Arrays;

public class _135_Candy {

    public static void main(String[] args) {
        int count = candy(new int[]{1,0,2});
        System.out.println(count);// should be 5
    }

    public static int candy(int[] ratings) {
        int[] res = new int[ratings.length];
        Arrays.fill(res, 1);

        for(int i=1; i<ratings.length; i++) {
            if(ratings[i] > ratings[i-1]) {
                res[i] = Math.max(res[i], res[i-1] + 1);
            }
        }

        for(int i=ratings.length-2; i>=0; i--) {
            if(ratings[i] > ratings[i+1]) {
                res[i] = Math.max(res[i], res[i+1] + 1);
            }
        }

        int count = 0;
        for(int i=0; i<ratings.length; i++) {
            count += res[i];
        }
        return count;
    }

    public static int candy2(int[] ratings) {
        int n = ratings.length;
        int i = 1;
        int candy = n;
        while(i < n) {
            if(ratings[i] == ratings[i-1]) {
                i++;
                continue;
            }

            int peak = 0;
            while(ratings[i] > ratings[i-1]) {
                peak++;
                candy += peak;
                i++;
                if(i == n){
                    return candy;
                }
            }

            int dip = 0;
            while(i<n && ratings[i] < ratings[i-1]) {
                dip++;
                candy += dip;
                i++;
            }
            candy -= Math.min(peak, dip);
        }
        return candy;
    }
}
