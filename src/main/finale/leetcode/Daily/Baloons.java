package main.finale.leetcode.Daily;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
public class Baloons {

    public static void main(String[] args) {
//        System.out.println(findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}}));
//        System.out.println(findMinArrowShots(new int[][]{{1,2},{2,3},{3,4},{4,5}}));
//        System.out.println(findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));//[]
        System.out.println(findMinArrowShots(new int[][]{{-2147483648,-2147483645},{2147483646,2147483647}}));
    }

    public static int findMinArrowShots(int[][] points) {
        if(points.length<=1){
            return points.length;
        }
        List<Point> list = new ArrayList<>();
        for(int i=0; i<points.length; i++){
            list.add(new Point(points[i][0], points[i][1]));
        }
        list.sort(Point::compareTo);
        int res = 0;
        while(list.size()>0){
            if(list.size()==1){
                res++; break;
            }
            Point curr1 = list.get(0);
            Point curr2 = list.get(1);

            if(curr1.end< curr2.start){
                res++;
                list.remove(0);
                continue;
            }
            res++;
            list.remove(0);
            list.remove(0);
        }
        return res;
    }

}

class Point implements Comparable<Point>{
    int start;
    int end;
    public Point(int start, int end){this.start=start; this.end=end;}

    @Override
    public int compareTo(Point obj){
        return this.start - obj.start;
    }
}