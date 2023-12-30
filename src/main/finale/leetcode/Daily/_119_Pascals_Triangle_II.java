package main.finale.leetcode.Daily;

import java.util.*;

public class _119_Pascals_Triangle_II {

    public static void main(String[] args) {
        List<Integer> list = getRow(4);
        System.out.println(list);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        for(int i=0; i<=rowIndex; i++) {
            List<Integer> newList = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) {
                    newList.add(1);
                } else {
                    newList.add(prev.get(j-1)+ prev.get(j));
                }
            }
            prev = newList;
        }
        return prev;
    }

}
